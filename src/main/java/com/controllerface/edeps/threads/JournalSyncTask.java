package com.controllerface.edeps.threads;

import com.controllerface.edeps.EventProcessingContext;
import com.controllerface.edeps.Procedure;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.structures.journal.JournalEvent;
import com.controllerface.edeps.structures.equipment.ships.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.util.Pair;

import java.io.*;
import java.lang.reflect.Type;
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
                    .filter(event -> hasEvent.test(event, line))
                    .findAny().isPresent();


    private final CommanderData commanderData;
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;

    private Path journalPath;
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");

    private final Procedure updateFunction;

    public static final TypeReference<Map> mapTypeReference = new TypeReference<Map>()
    {
        @Override public Type getType() {return HashMap.class;}
    };

    public JournalSyncTask(Procedure updateFunction, CommanderData commanderData,
                           BlockingQueue<Pair<ProcurementCost, Integer>> transactions)
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
                File[] files = journalPath.toFile().listFiles();

                if (files == null) continue;

                File check = Arrays.stream(files)
                        .filter(f->f.getName().equals(currentJournalFile.get()))
                        .findFirst().orElse(null);

                if (check == null) continue;

                if (!check.exists())
                {
                    go = false;
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
                            FileReader reader = null;
                            try
                            {
                                AtomicInteger currentLine = new AtomicInteger(0);
                                reader = new FileReader(next);
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
                        else
                        {
                            // todo: process other files (market, outfitting, etc.)
                            System.out.println("File updated: " + next.getName());
                        }
                    });
            watchKey.reset();
        }
    }

    private Stream<String> readJournalLines(File file)
    {
        List<String> journalLines = new ArrayList<>();
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

        Arrays.stream(journalFolder.listFiles((directory, file) -> file.startsWith("Journal")))
                .sorted(newestJournalFile)
                .limit(1).flatMap(this::readJournalLines)
                .filter(hasSupportedEvent)
                .forEach(this::processJSONEvent);
    }

    /**
     * Processes a generic JSON event, delegating final processing to a specific method based on the event type
     *
     * @param json raw JSON event to process
     */
    private void processJSONEvent(String json)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        JournalEvent event;
        Map<String, Object> data;
        try
        {
            data = objectMapper.readValue(json, mapTypeReference);
            String eventName = ((String) data.get("event"));
            event = JournalEvent.valueOf(eventName);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException("Error reading journal data", e);
        }

        EventProcessingContext context = new EventProcessingContext(data, transactions, commanderData, updateFunction);
        event.process(context);
    }
}
