package com.controllerface.edeps.threads;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.storage.PlayerInventory;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.materials.Material;
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

/**
 * Task thread that keeps a PlayerInventory synchronized by monitoring the player's journal entries,
 * adding transactions to the transaction queue that modify the inventory when relevant events occur.
 *
 * Created by Stephen on 4/4/2018.
 */
public class InventorySyncTask implements Runnable
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
     * Events that may contain updates for the player's inventory
     */

    private static Set<String> inventoryEvents = new HashSet<>();
    static
    {
        // these are the main startup events that contain the player's starting inventory
        inventoryEvents.add("Cargo");
        inventoryEvents.add("Materials");

        // common events
        inventoryEvents.add("EngineerContribution");
        inventoryEvents.add("MissionCompleted");
        inventoryEvents.add("TechnologyBroker");

        // material events
        inventoryEvents.add("MaterialCollected");
        inventoryEvents.add("MaterialDiscarded");
        inventoryEvents.add("EngineerCraft");
        inventoryEvents.add("MaterialTrade");
        inventoryEvents.add("Synthesis");
        inventoryEvents.add("ScientificResearch");

        // cargo events
        inventoryEvents.add("CollectCargo");
        inventoryEvents.add("EjectCargo");
        inventoryEvents.add("MarketBuy");
        inventoryEvents.add("MarketSell");
        inventoryEvents.add("MiningRefined");
        inventoryEvents.add("CargoDepot");
        inventoryEvents.add("PowerplayCollect");
        inventoryEvents.add("PowerplayDeliver");
    }

    private BiPredicate<String, String> hasEvent =
            (event, line) -> line.contains("\"event\":\"" + event + "\"");

    /**
     * Ship function used to filter in JSON event lines that changes to the player's inventory
     */
    private Predicate<String> hasInventoryEvent =
            (line) -> inventoryEvents.stream()
                    .filter(event -> hasEvent.test(event, line))
                    .findAny().isPresent();


    private final AtomicReference<String> currentJournalFile = new AtomicReference<>("");
    private final AtomicInteger lastLine = new AtomicInteger(0);
    private final PlayerInventory playerInventory;
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;
    private Path journalPath;

    public static final TypeReference<Map> mapTypeReference = new TypeReference<Map>()
    {
        @Override public Type getType() {return HashMap.class;}
    };

    public InventorySyncTask(PlayerInventory playerInventory,
                             BlockingQueue<Pair<ProcurementCost, Integer>> transactions)
    {
        this.playerInventory = playerInventory;
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
            throw new RuntimeException("BROKEN",e);
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
                                        if (hasInventoryEvent.test(rawEvent)) processJSONEvent(rawEvent);
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
        File journalFolder = new File(JOURNAL_FOLDER);
        journalPath = journalFolder.toPath();
        List<String> journalLines = new ArrayList<>();

        Arrays.stream(journalFolder.listFiles((x, y) -> y.startsWith("Journal")))
                .sorted(newestJournalFile)
                .limit(1).findAny()
                .ifPresent(file ->
                {
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
                });

        journalLines.stream()
                .filter(hasInventoryEvent)
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
            case "Cargo":
                processMainCargoEvent(data);
                break;

            case "CollectCargo":
                processCollectCargoEvent(data);
                break;

            case "EngineerContribution":
                processEngineerContributionEvent(data);
                break;

            case "EngineerCraft":
                processEngineerCraftEvent(data);
                break;

            case "EjectCargo":
                processEjectCargoEvent(data);
                break;

            case "MarketBuy":
                processMarketBuyEvent(data);
                break;

            case "MarketSell":
                processMarketSellEvent(data);
                break;

            case "MiningRefined":
                processMiningRefinedEvent(data);
                break;

            case "CargoDepot":
                processCargoDepotEvent(data);
                break;

            case "PowerplayCollect":
                processPowerPlayCollectEvent(data);
                break;

            case "PowerplayDeliver":
                processPowerPlayDeliverEvent(data);
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
        playerInventory.clear();

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

    @SuppressWarnings("unchecked")
    private void processMainCargoEvent(Map<String, Object> data)
    {
        ((List<Map<String, Object>>) data.get("Inventory")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Commodity.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(transactions::add);
    }


    private void processCargoDepotEvent(Map<String, Object> data)
    {
        String updateType = ((String) data.get("UpdateType"));

        int modifier = 0;

        switch (updateType)
        {
            case "Deliver":
                modifier = -1;
                break;

            case "Collect":
                modifier = 1;
                break;

            case "WingUpdate":
                return;
        }

        String name = ((String) data.get("CargoType")).toUpperCase();
        int count = ((int) data.get("Count")) * modifier;
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }

    private void processMaterialCollectedEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = ((int) data.get("Count"));
        Material material = Material.valueOf(name);
        transactions.add(new Pair<>(material, count));
    }

    private void processMarketBuyEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        int count = ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }

    private void processCargoAdd_NameVariant(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }

    private void processPowerPlayCollectEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        int count = ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }

    private void processCollectCargoEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, 1));
    }

    private void processMiningRefinedEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, 1));
    }

    private void processMaterialDiscardedEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Name")).toUpperCase();
        int count = (-1) * ((int) data.get("Count"));
        Material material = Material.valueOf(name);
        transactions.add(new Pair<>(material, count));
    }

    private void processEjectCargoEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        int count = (-1) * ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }

    private void processPowerPlayDeliverEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        int count = (-1) * ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }


    private void processMarketSellEvent(Map<String, Object> data)
    {
        String name = ((String) data.get("Type")).toUpperCase();
        int count = (-1) * ((int) data.get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        transactions.add(new Pair<>(commodity, count));
    }


    private void processEngineerCraftEvent(Map<String, Object> data)
    {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> ingredients = ((List<Map<String, Object>>) data.get("Ingredients"));
        ingredients.forEach(this::processMaterialDiscardedEvent);
    }

    private void processEngineerContributionEvent(Map<String, Object> data)
    {
        if (data.get("Material") != null)
        {
            String name = ((String) data.get("Material")).toUpperCase();
            Material material = Material.valueOf(name);
            int quantity = (-1) * ((int) data.get("Quantity"));
            transactions.add(new Pair<>(material, quantity));
        }

        if (data.get("Commodity") != null)
        {
            String name = ((String) data.get("Commodity")).toUpperCase();
            Commodity commodity = Commodity.valueOf(name);
            int quantity = (-1) * ((int) data.get("Quantity"));
            transactions.add(new Pair<>(commodity, quantity));
        }
    }

    private void processTechnologyBrokerEvent(Map<String, Object> data)
    {
        if (data.get("Materials") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> materials = ((List<Map<String, Object>>) data.get("Materials"));
            materials.forEach(this::processMaterialDiscardedEvent);
        }

        if (data.get("Commodities") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> commodities = ((List<Map<String, Object>>) data.get("Commodities"));
            commodities.forEach(this::processCargoAdd_NameVariant);
        }
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
        if (data.get("MaterialsReward") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> reward = ((List<Map<String, Object>>) data.get("MaterialsReward"));
            reward.forEach(this::processMaterialCollectedEvent);
        }

        if (data.get("CommodityReward") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> reward = ((List<Map<String, Object>>) data.get("CommodityReward"));
            reward.forEach(this::processCargoAdd_NameVariant);
        }

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
