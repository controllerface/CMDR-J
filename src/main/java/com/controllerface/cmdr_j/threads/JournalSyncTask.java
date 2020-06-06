package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.JSONSupport;
import com.controllerface.cmdr_j.classes.commander.CommanderData;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task thread that keeps a CommanderData synchronized by monitoring the player's journal entries,
 * adding transactions to the transaction queue that modify the inventory when relevant events occur.
 *
 * Created by Controllerface on 4/4/2018.
 */
public class JournalSyncTask implements Runnable
{
    private enum SupplementalDataFile
    {
        MARKET("Market.json"),
        CARGO("Cargo.json");

        private final String fileName;

        SupplementalDataFile(String fileName)
        {
            this.fileName = fileName;
        }
    }

    private static final String JOURNAL_FOLDER = System.getProperty("user.home")
            + File.separator + "Saved Games"
            + File.separator + "Frontier Developments"
            + File.separator + "Elite Dangerous";

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


    /**
     * For ship stats, we want to combine several groups of stats together, and add a couple of "player" stats as well
     * that are useful for the ship tab. In this set, we want all values in the CoreInternalSlot, CosmeticSlot,
     * HardpointSlot, and OptionalInternalSlot enums.
     */
    public static Set<Statistic> shipStats =
            Stream.concat(Arrays.stream(CoreInternalSlot.values()),                 // Core Modules
                    Stream.concat(Arrays.stream(CosmeticSlot.values()),             // Cosmetics
                            Stream.concat(Arrays.stream(HardpointSlot.values()),    // Weapons
                                    Arrays.stream(OptionalInternalSlot.values())))) // Optional Internals
            .collect(Collectors.toSet());

    /**
     * Events that may contain updates for the player's inventory
     */
    private static final Set<String> journalEvents = Arrays.stream(JournalEvent.values())
            .map(Enum::name)
            .collect(Collectors.toSet());

    /**
     * Function used to filter in JSON event lines that we explicitly support
     */
    private final Predicate<Map<String, Object>> hasSupportedEvent =
            (line) ->
            {
                String eventName = (String) line.get("event");
                boolean supported = journalEvents.stream().anyMatch(event -> event.equals(eventName));
                if (!supported)
                {
                    System.out.println("Unsupported Event: " + eventName);
                }
                return supported;
            };


    private final CommanderData commanderData;
    private final BlockingQueue<UserTransaction> transactions;

    private Path journalPath;
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");

    private long lastFileSize = 0;

    public JournalSyncTask(CommanderData commanderData, BlockingQueue<UserTransaction> transactions)
    {
        this.commanderData = commanderData;
        this.transactions = transactions;
    }

    @Override
    public void run()
    {
        Thread.currentThread().setName("Commander Journal Sync");

        initializeJournalData();

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

            if (watchKey == null)
            {
                if (sawChange.get())
                {
                    System.out.println("Saw file change but watch key did not trigger");
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

                Map<String, Object> data = JSONSupport.Parse.jsonString.apply(rawEvent);
                if (hasSupportedEvent.test(data)) processJSONEvent(data);
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
                        Map<String, Object> data = JSONSupport.Parse.jsonString.apply(rawEvent);
                        if (hasSupportedEvent.test(data)) processJSONEvent(data);
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

    private static Stream<String> readLines(File file)
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

        try
        {
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);

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
        return journalLines.stream();
    }

    private static Map<String, Object> readSupplementalFile(SupplementalDataFile dataFile)
    {
        File journalFolder = new File(JOURNAL_FOLDER);

        File[] dataFiles = journalFolder.listFiles(((dir, name) -> name.equals(dataFile.fileName)));

        if (dataFiles != null && dataFiles.length > 0)
        {
            String jsonString = Arrays.stream(dataFiles)
                    .limit(1)
                    .flatMap(JournalSyncTask::readLines)
                    .collect(Collectors.joining());

            return JSONSupport.Parse.jsonString.apply(jsonString);
        }
        return Collections.emptyMap();
    }

    public static Map<String, Object> readMarketData()
    {
        return readSupplementalFile(SupplementalDataFile.MARKET);
    }

    public static Map<String, Object> readCargoData()
    {
        return readSupplementalFile(SupplementalDataFile.CARGO);
    }

    private void initializeJournalData()
    {
        // todo: maybe this should be configurable
        File journalFolder = new File(JOURNAL_FOLDER);
        journalPath = journalFolder.toPath();

        File[] journalFiles = journalFolder
                .listFiles((directory, file) -> file.startsWith("Journal") && file.endsWith(".log"));

        // todo: maybe print an error of some kind
        if (journalFiles == null) return;

        Arrays.stream(journalFiles)
                .sorted(newestJournalFile)
                .limit(1).flatMap(this::readJournalLines)
                .map(JSONSupport.Parse.jsonString)
                .filter(hasSupportedEvent)
                .forEach(this::processJSONEvent);
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
            readJournalLines(currentName)
                    .map(JSONSupport.Parse.jsonString)
                    .filter(hasSupportedEvent)
                    .forEach(this::processJSONEvent);
        }
    }

    /**
     * Processes a generic JSON event, delegating final processing to a specific method based on the event type
     *
     * @param data raw JSON event to process
     */
    private void processJSONEvent(Map<String, Object> data)
    {
        JournalEvent event;
        try
        {
            String eventName = ((String) data.get("event"));
            event = JournalEvent.valueOf(eventName);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Error reading journal data", e);
        }


        // todo: abstract transactions further and eliminate need to pass commanderData into the context object
        EventProcessingContext context = new EventProcessingContext(data, transactions, commanderData);
        event.process(context);
    }
}
