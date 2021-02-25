package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.JSONSupport;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task thread that keeps a CommanderData synchronized by monitoring the player's journal entries,
 * adding transactions to the transaction queue that modify the inventory when relevant events occur.
 *
 * Created by Controllerface on 4/4/2018.
 */
public class JournalSyncTaskEX implements Runnable
{
    private final GameState gameState;

    private enum SupplementalDataFile
    {
        MARKET("Market.json"),
        OUTFITTING("Outfitting.json"),
        SHIPYARD("Shipyard.json"),
        CARGO("Cargo.json"),
        NAV_ROUTE("NavRoute.json");

        private final String fileName;

        SupplementalDataFile(String fileName)
        {
            this.fileName = fileName;
        }
    }

    private static final String DEFAULT_JOURNAL_FOLDER = System.getProperty("user.home")
        + File.separator + "Saved Games"
        + File.separator + "Frontier Developments"
        + File.separator + "Elite Dangerous";

    private static final boolean testing = Boolean.parseBoolean(System.getProperty("journal.test", "false"));

    private static final String journalFolder = setJournalFolder();


    /**
     * Comparator used when starting up to locate the newest journal file on disk
     */
    private static final Comparator<File> newestJournalFile =
            (file1, file2) ->
            {
                String name1 = file1.toPath().getFileName().toString();
                String[] n1a = name1.split("\\.");

                String name2 = file2.toPath().getFileName().toString();
                String[] n2a = name2.split("\\.");

                if (n1a.length < 2 || n2a.length < 2)
                {
                    if (n1a.length < 2 && n2a.length < 2) return 0;
                    else return n1a.length < 2 ? 1 : -1;
                }

                try
                {
                    long timestamp1 = Long.parseLong(n1a[1]);
                    long timestamp2 = Long.parseLong(n2a[1]);
                    return (int) (timestamp2 - timestamp1);
                }
                catch (NumberFormatException e)
                {
                    e.printStackTrace();
                    throw e;
                }
            };

    public static final Comparator<File> oldestJournalFile = newestJournalFile.reversed();

    private Path journalPath;
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");

    private long lastFileSize = 0;

    public JournalSyncTaskEX(GameState gameState)
    {
        this.gameState = gameState;
    }

    private static String setJournalFolder()
    {
        return testing
            ? System.getProperty("journal.test.folder")
            : DEFAULT_JOURNAL_FOLDER;
    }

    @Override
    public void run()
    {
        Thread.currentThread().setName("Commander Journal Sync");

        try
        {
            initializeJournalData();
        }
        catch (MalformedURLException | URISyntaxException e)
        {
            e.printStackTrace();
            return;
        }

        AtomicBoolean sawChange =  new AtomicBoolean(false);
        WatchKey watchKey;
        WatchService watchService;
        try
        {
            watchService = FileSystems.getDefault().newWatchService();
            watchKey = journalPath.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.OVERFLOW);

            System.out.println("Journal Folder : " + watchKey.watchable());
            System.out.println("Journal File: " + currentJournalFile.get());
        }
        catch (IOException e)
        {
            throw new RuntimeException("BROKEN", e);
        }

        boolean go = true;
        while (go)
        {
            try
            {
                watchKey = watchService.poll(1, TimeUnit.SECONDS);
            }
            catch (InterruptedException e)
            {
                go = false;
                continue;
            }

            if (Thread.interrupted())
            {
                go = false;
                continue;
            }

            if (watchKey == null)
            {
                if (sawChange.get())
                {
                    //System.out.println("Saw file change but watch key did not trigger");
                }

                File[] files = journalPath.toFile().listFiles();

                if (files == null) continue;

                File check = Arrays.stream(files)
                        .filter(f->f.getName().equals(currentJournalFile.get()))
                        .findFirst().orElse(null);

                if (check == null) continue;

                if (lastFileSize != check.length())
                {
                    System.out.println("File size changed: " + lastFileSize + " to: " + check.length());
                    lastFileSize = check.length();
                    sawChange.set(true);
                }

                if (check.exists())
                {
                    reInitializeJournalData();
                }
                continue;
            }

            watchKey.pollEvents()
                    .forEach(watchEvent ->
                    {
                        File[] files = journalPath.toFile().listFiles();

                        if (files == null) return;

                        File next = Arrays.stream(files)
                                .filter(f -> f.getName().equals(watchEvent.context().toString()))
                                .findFirst().orElse(null);

                        if (next == null) return;

                        sawChange.set(false);

                        if (next.getName().equals(currentJournalFile.get()))
                        {
                            processEventFile(next, false);
                        }
                        else
                        {
                            // todo: process other files (market, outfitting, etc.)
                            processEventFile(next, true);
                        }
                    });
            watchKey.reset();
        }
    }

    private void processEventFile(File file, boolean readAll)
    {
        FileReader reader;
        try
        {
            if (readAll)
            {
                reader = new FileReader(file);
                BufferedReader buf = new BufferedReader(reader);
                String rawEvent = buf.lines().collect(Collectors.joining());

                // the watch key can sometimes trigger twice ina  row, once before
                // the file is ready and once after. It is not clear why this happens,
                // but this effectively ensures we don't crash when the file is not ready
                // when the key is triggered.
                if (rawEvent.isEmpty()) { return; }

                processEvent(rawEvent);
            }
            else
            {
                AtomicInteger currentLine = new AtomicInteger(0);
                reader = new FileReader(file);
                BufferedReader buf = new BufferedReader(reader);
                buf.lines().forEach((rawEvent) ->
                {
                    if (currentLine.incrementAndGet() > lastLine.get())
                    {
                        processEvent(rawEvent);
                    }
                });
                lastLine.set(currentLine.get());
            }
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
    }

    public static Stream<String> readLines(File file)
    {
        List<String> fileLines = new ArrayList<>();
        try
        {
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            buf.lines().forEach(fileLines::add);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return fileLines.stream();
    }

    private Stream<String> readJournalLines(File file)
    {
        List<String> journalLines = new ArrayList<>();
        lastFileSize = file.length();
        currentJournalFile.set(file.getName());

        FileReader reader = null;
        BufferedReader buf = null;
        try
        {
            reader = new FileReader(file);
            buf = new BufferedReader(reader);

            buf.lines().forEach((e) ->
            {
                lastLine.incrementAndGet();
                journalLines.add(e);
            });
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (buf != null)
            {
                try
                {
                    buf.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return journalLines.stream();
    }

    private static Map<String, Object> readSupplementalFile(SupplementalDataFile dataFile)
    {
        File journalFolder = new File(JournalSyncTaskEX.journalFolder);

        File[] dataFiles = journalFolder.listFiles(((dir, name) -> name.equals(dataFile.fileName)));

        if (dataFiles != null && dataFiles.length > 0)
        {
            String jsonString = Arrays.stream(dataFiles)
                    .limit(1)
                    .flatMap(JournalSyncTaskEX::readLines)
                    .collect(Collectors.joining());

            return JSONSupport.Parse.jsonString.apply(jsonString);
        }
        return Collections.emptyMap();
    }

    public static Map<String, Object> readMarketData()
    {
        return readSupplementalFile(SupplementalDataFile.MARKET);
    }

    public static Map<String, Object> readOutfittingData()
    {
        return readSupplementalFile(SupplementalDataFile.OUTFITTING);
    }

    public static Map<String, Object> readShipyardData()
    {
        return readSupplementalFile(SupplementalDataFile.SHIPYARD);
    }


    public static Map<String, Object> readCargoData()
    {
        return readSupplementalFile(SupplementalDataFile.CARGO);
    }

    public static Map<String, Object> readNavRouteData()
    {
        return readSupplementalFile(SupplementalDataFile.NAV_ROUTE);
    }

    public static File[] listJournalFiles()
    {
        File journalFolder = new File(JournalSyncTaskEX.journalFolder);
        return journalFolder.listFiles((directory, file) ->
            file.startsWith("Journal.") && file.endsWith(".log"));
    }

    private void initializeJournalData() throws MalformedURLException, URISyntaxException
    {
        journalPath = new File(journalFolder).toPath();

        File[] journalFiles = listJournalFiles();

        // todo: maybe print an error of some kind
        if (journalFiles == null) return;

        Arrays.stream(journalFiles)
                .sorted(newestJournalFile)
                .limit(1).flatMap(this::readJournalLines)
                .forEach(this::processEvent);
    }

    private void reInitializeJournalData()
    {
        File[] journalFiles = journalPath.toFile()
            .listFiles((directory, file) -> file.startsWith("Journal") && file.endsWith(".log"));

        // todo: maybe print an error of some kind
        if (journalFiles == null) return;

        File currentName = Arrays.stream(journalFiles)
                .sorted(newestJournalFile)
                .limit(1).findAny().orElse(null);

        // todo: maybe print an error of some kind
        if (currentName == null) return;

        if (!currentName.getName().equals(currentJournalFile.get()))
        {
            System.out.println("new journal detected: " + currentName.getName());
            readJournalLines(currentName).forEach(this::processEvent);
        }
    }

    private void processEvent(String rawEvent)
    {
        Map<String, Object> eventData = JSONSupport.Parse.jsonString.apply(rawEvent);
        JournalEventEX.withName((String) eventData.get("event"))
            .ifPresent(handler -> handler.process(gameState, eventData));
    }
}
