package com.controllerface.edeps.threads;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.MaterialInventory;
import com.controllerface.edeps.enums.materials.Material;
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
import java.util.function.Predicate;

/**
 * Task thread that keeps a MaterialInventory synchronized by executing transactions that modify it
 *
 * Created by Stephen on 4/4/2018.
 */
public class DiskMonitorTask implements Runnable
{
    private static final String JOURNAL_FOLDER = System.getProperty("user.home")
            + File.separator + "Saved Games"
            + File.separator + "Frontier Developments"
            + File.separator + "Elite Dangerous";

    /**
     * Events that may contain updates for the player's material inventory
     */
    private static Set<String> matEvents = new HashSet<>();
    static
    {
        matEvents.add("Materials");
        matEvents.add("MaterialCollected");
        matEvents.add("MaterialDiscarded");
        matEvents.add("EngineerContribution");
        matEvents.add("EngineerCraft");
        matEvents.add("MaterialTrade");
        matEvents.add("MissionCompleted");
        matEvents.add("TechnologyBroker");
        matEvents.add("Synthesis");
        matEvents.add("ScientificResearch");
    }

    /**
     * Utility function used to filter in JSON event lines that changes to the player's material inventory
     */
    private Predicate<String> hasMatEvent =
            (line) -> matEvents.stream()
                    .filter(event -> line.contains("\"event\":\"" + event + "\""))
                    .findAny().isPresent();

    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final MaterialInventory materialInventory;
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;
    private File journalFolder;
    private Path journalPath;

    private WatchKey watchKey;
    private WatchService watchService;

    public static final TypeReference<Map> mapTypeReference = new TypeReference<Map>()
    {
        @Override public Type getType() {return HashMap.class;}
    };

    public DiskMonitorTask(MaterialInventory materialInventory,
                    BlockingQueue<Pair<ProcurementCost, Integer>> transactions)
    {
        this.materialInventory = materialInventory;
        this.transactions = transactions;
    }

    @Override
    public void run()
    {
        initializeJournalData();

        try
        {
            watchService = FileSystems.getDefault().newWatchService();
            watchKey = journalPath.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.OVERFLOW);

        }
        catch (IOException e)
        {
            throw new RuntimeException("BROKEN",e);
        }

        boolean go = true;
        while (go)
        {
            try {watchKey = watchService.poll(1, TimeUnit.SECONDS);}
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
                                        if (hasMatEvent.test(rawEvent)) processJSONEvent(rawEvent);
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

    private void initializeJournalData()
    {
        // todo: maybe this should be configurable
        journalFolder = new File(JOURNAL_FOLDER);
        journalPath = journalFolder.toPath();
        List<String> journalLines = new ArrayList<>();

        Arrays.stream(journalFolder.listFiles((x, y) -> y.startsWith("Journal")))
                .sorted((file1, file2) ->
                {
                    String name1= file1.toPath().getFileName().toString();
                    String[] n1a = name1.split("\\.");

                    String name2= file2.toPath().getFileName().toString();
                    String[] n2a = name2.split("\\.");

                    long timestamp1 = Long.parseLong(n1a[1]);
                    long timestamp2 = Long.parseLong(n2a[1]);

                    return (int) (timestamp2 - timestamp1);
                })
                .limit(1).findAny()
                .ifPresent(file ->
                {
                    currentJournalFile.set(file.getName());
                    System.out.println(currentJournalFile.get());
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
                });

        journalLines.stream()
                .filter(hasMatEvent)
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
        Map<String, Object> data;
        try
        {
            data = objectMapper.readValue(json, mapTypeReference);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException("Error reading journal data", e);
        }
        String eventName = ((String) data.get("event"));

        switch (eventName)
        {
            case "EngineerContribution":
                processEngineerContributionEvent(data);
                break;

            case "EngineerCraft":
                processEngineerCraftEvent(data);
                break;

            case "Materials":
                processMainMaterialEvent(data);
                break;

            case "MaterialCollected":
                processMaterialCollectedEvent(data);
                break;

            case "MaterialDiscarded":
                processMaterialDiscardedEvent(data);
                break;

            case "MaterialTrade":
                processMaterialTradeEvent(data);
                break;

            case "MissionCompleted":
                processMissionCompletedEvent(data);
                break;

            case "ScientificResearch":
                processScientificResearchEvent(data);
                break;

            case "Synthesis":
                processSynthesisEvent(data);
                break;

            case "TechnologyBroker":
                processTechnologyBrokerEvent(data);
                break;

            default:
                System.out.println("NOPE!" + eventName);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    private void processMainMaterialEvent(Map<String, Object> data)
    {
        transactions.clear();
        materialInventory.clear();

        ((List<Map<String, Object>>) data.get("Raw")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(transactions::add);

        ((List<Map<String, Object>>) data.get("Manufactured")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(transactions::add);

        ((List<Map<String, Object>>) data.get("Encoded")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(transactions::add);
    }

    private void processMaterialCollectedEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = ((int) data.get("Count"));
        Material material = Material.valueOf(name);
        transactions.add(new Pair<>(material, count));
    }

    private void processMaterialDiscardedEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = (-1) * ((int) data.get("Count"));
        Material material = Material.valueOf(name);
        transactions.add(new Pair<>(material, count));
    }

    private void processEngineerCraftEvent(Map<String, Object> data)
    {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> ingredients = ((List<Map<String, Object>>) data.get("Ingredients"));
        ingredients.forEach(this::processMaterialDiscardedEvent);
    }

    private void processEngineerContributionEvent(Map<String, Object> data)
    {
        if (data.get("Material") == null) return;

        String name = ((String) data.get("Material")).toUpperCase();
        Material material = Material.valueOf(name);
        int quantity = (-1) * ((int) data.get("Quantity"));
        transactions.add(new Pair<>(material, quantity));
    }

    private void processTechnologyBrokerEvent(Map<String, Object> data)
    {
        if (data.get("Materials") == null) return;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> materials = ((List<Map<String, Object>>) data.get("Materials"));
        materials.forEach(this::processMaterialDiscardedEvent);
    }

    private void processSynthesisEvent(Map<String, Object> data)
    {
        if (data.get("Materials") == null) return;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> materials = ((List<Map<String, Object>>) data.get("Materials"));
        materials.forEach(this::processMaterialDiscardedEvent);
    }

    private void processScientificResearchEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = ((int) data.get("Count"));
        Material material = Material.valueOf(name);
        transactions.add(new Pair<>(material, count));
    }

    private void processMissionCompletedEvent(Map<String, Object> data)
    {
        if (data.get("MaterialsReward") == null) return;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> reward = ((List<Map<String, Object>>) data.get("MaterialsReward"));
        reward.forEach(this::processMaterialCollectedEvent);
    }

    private void processMaterialTradeEvent(Map<String, Object> data)
    {
        @SuppressWarnings("unchecked")
        Map<String, Object> paid = ((Map<String, Object>) data.get("Paid"));
        String paidName = ((String) paid.get("Material")).toUpperCase();
        Material paidMaterial = Material.valueOf(paidName);
        int paidQuantity = (-1) * ((int) paid.get("Quantity"));

        transactions.add(new Pair<>(paidMaterial, paidQuantity));

        @SuppressWarnings("unchecked")
        Map<String, Object> received = ((Map<String, Object>) data.get("Received"));
        String receivedName = ((String) received.get("Material")).toUpperCase();
        Material receivedMaterial = Material.valueOf(receivedName);
        int receivedQuantity = ((int) received.get("Quantity"));

        transactions.add(new Pair<>(receivedMaterial, receivedQuantity));
    }
}
