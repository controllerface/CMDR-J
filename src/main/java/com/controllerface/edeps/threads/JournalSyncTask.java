package com.controllerface.edeps.threads;

import com.controllerface.edeps.*;
import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.structures.commander.PlayerStat;
import com.controllerface.edeps.structures.commander.RankStat;
import com.controllerface.edeps.structures.equipment.ships.CoreInternalSlot;
import com.controllerface.edeps.structures.equipment.ships.CosmeticSlot;
import com.controllerface.edeps.structures.equipment.ships.HardpointSlot;
import com.controllerface.edeps.structures.equipment.ships.OptionalInternalSlot;
import com.controllerface.edeps.structures.journal.JournalEvent;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task thread that keeps a CommanderData synchronized by monitoring the player's journal entries,
 * adding transactions to the transaction queue that modify the inventory when relevant events occur.
 *
 * Created by Stephen on 4/4/2018.
 */
public class JournalSyncTask implements Runnable
{
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

                long timestamp1 = Long.parseLong(n1a[1]);
                long timestamp2 = Long.parseLong(n2a[1]);

                return (int) (timestamp2 - timestamp1);
            };


    /**
     * For ship stats, we want to combine several groups of stats together, and add a couple of "player" stats as well
     * that are useful for the ship tab. In this set, we want all values in the CoreInternalSlot, CosmeticSlot,
     * HardpointSlot, and OptionalInternalSlot enums.
     */
    public static Set<Statistic> allStats  =
            Stream.concat(Arrays.stream(CoreInternalSlot.values()),
                    Stream.concat(Arrays.stream(CosmeticSlot.values()),
                            Stream.concat(Arrays.stream(HardpointSlot.values()),
                                    Stream.concat(Arrays.stream(OptionalInternalSlot.values()),
                                            Stream.concat(Arrays.stream(PlayerStat.values()),
                                                    Arrays.stream(RankStat.values()))))))
                    .collect(Collectors.toSet());


    /**
     * Defines all of the relevant stats for the Commander tab. This consists of all the values of the PlayerStat enum
     */
    public static Set<Statistic> playerStats = Arrays.stream(PlayerStat.values()).collect(Collectors.toSet());


    /**
     * Defines all of the relevant stats for the Rank tab. This consists of all the values of the RankStat enum
     */
    public static Set<Statistic> rankStats = Arrays.stream(RankStat.values()).collect(Collectors.toSet());


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
    private static Set<String> journalEvents = Arrays.stream(JournalEvent.values())
            .map(Enum::name)
            .collect(Collectors.toSet());

    private BiPredicate<String, String> hasEvent =
            (event, line) -> line.contains("\"event\":\"" + event + "\"");

    /**
     * Function used to filter in JSON event lines that we explicitly support
     */
    private Predicate<String> hasSupportedEvent =
            (line) -> journalEvents.stream()
                    .anyMatch(event -> hasEvent.test(event, line));


    private final CommanderData commanderData;
    private final BlockingQueue<UserTransaction> transactions;

    private Path journalPath;
    private File journalFile;
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");

    private long lastFileSize = 0;

    private final Procedure updateFunction;


    public JournalSyncTask(Procedure updateFunction,
                           CommanderData commanderData,
                           BlockingQueue<UserTransaction> transactions)
    {
        this.updateFunction = updateFunction;
        this.commanderData = commanderData;
        this.transactions = transactions;
    }

    @Override
    public void run()
    {
        initializeJournalData();

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
            System.out.println("\u001b" + "[32m" + "Journal File: " + currentJournalFile.get());
            //System.out.println("Journal File: " + currentJournalFile.get());
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
                watchKey = watchService.poll(5, TimeUnit.SECONDS);
            }
            catch (InterruptedException e)
            {
                go = false;
                continue;
            }

            if (watchKey == null)
            {
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

                        if (next.getName().equals(currentJournalFile.get()))
                        {
                            System.out.println("watch key triggered");
                            processJournalFile(next);
                        }
                        else
                        {
                            // todo: process other files (market, outfitting, etc.)
                            System.out.println("File updated: " + next.getName());
                        }
                    });
            watchKey.reset();
        }
    }

    private void processJournalFile(File file)
    {

        FileReader reader = null;
        try
        {
            AtomicInteger currentLine = new AtomicInteger(0);
            reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            buf.lines().forEach((rawEvent) ->
            {
                if (currentLine.incrementAndGet() > lastLine.get())
                {
                    if (hasSupportedEvent.test(rawEvent)) processJSONEvent(rawEvent);
                }
            });
            lastLine.set(currentLine.get());
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
    }

    private Stream<String> readJournalLines(File file)
    {
        List<String> journalLines = new ArrayList<>();
        journalFile = file;
        lastFileSize = journalFile.length();
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

    private void initializeJournalData()
    {
        // todo: maybe this should be configurable
        File journalFolder = new File(JOURNAL_FOLDER);
        journalPath = journalFolder.toPath();

        File[] journalFiles = journalFolder.listFiles((directory, file) -> file.startsWith("Journal"));

        // todo: maybe print an error of some kind
        if (journalFiles == null) return;

        Arrays.stream(journalFiles)
                .sorted(newestJournalFile)
                .limit(1).flatMap(this::readJournalLines)
                .filter(hasSupportedEvent)
                .forEach(this::processJSONEvent);
    }

    private void reInitializeJournalData()
    {

        File[] journalFiles = journalPath.toFile().listFiles((directory, file) -> file.startsWith("Journal"));

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
                .filter(hasSupportedEvent)
                .forEach(this::processJSONEvent);
        }
    }
    /**
     * Processes a generic JSON event, delegating final processing to a specific method based on the event type
     *
     * @param json raw JSON event to process
     */
    private void processJSONEvent(String json)
    {
        JournalEvent event;
        Map<String, Object> data;
        try
        {
            data = JSONSupport.Parse.jsonString.apply(json);
            String eventName = ((String) data.get("event"));
            event = JournalEvent.valueOf(eventName);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Error reading journal data: " + json, e);
        }


        // todo: abstract transactions further and eliminate need to pass commanderData into the context object
        EventProcessingContext context = new EventProcessingContext(data, transactions, commanderData, updateFunction);
        event.process(context);
    }
}
