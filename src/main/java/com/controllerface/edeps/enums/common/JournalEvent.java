package com.controllerface.edeps.enums.common;

import com.controllerface.edeps.EventProcessingContext;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.equipment.ships.*;
import com.controllerface.edeps.threads.JournalSyncTask;
import javafx.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by Stephen on 4/16/2018.
 */
public enum JournalEvent
{
    @SuppressWarnings("unchecked")
    Cargo((context)-> ((List<Map<String, Object>>) context.getRawData().get("Inventory")).stream()
            .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                    item.get("Count").toString()))
            .map(sitem -> new Pair<>(((ProcurementCost) Commodity.valueOf(sitem.getKey())),
                    Integer.parseInt(sitem.getValue())))
            .forEach(context.getTransactions()::add)),

    @SuppressWarnings("unchecked")
    Materials((context)->
    {
        context.getPlayerInventory().clear();

        Map<String, Object> data = context.getRawData();

        ((List<Map<String, Object>>) data.get("Raw")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(context.getTransactions()::add);

        ((List<Map<String, Object>>) data.get("Manufactured")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(context.getTransactions()::add);

        ((List<Map<String, Object>>) data.get("Encoded")).stream()
                .map(item-> new Pair<>(item.get("Name").toString().toUpperCase(),
                        item.get("Count").toString()))
                .map(sitem -> new Pair<>(((ProcurementCost) Material.valueOf(sitem.getKey())),
                        Integer.parseInt(sitem.getValue())))
                .forEach(context.getTransactions()::add);
    }),

    // common events
    EngineerContribution((context)->
    {
        Map<String, Object> data = context.getRawData();
        if (data.get("Material") != null)
        {
            String name = ((String) data.get("Material")).toUpperCase();
            Material material = Material.valueOf(name);
            int quantity = (-1) * ((int) data.get("Quantity"));
            context.getTransactions().add(new Pair<>(material, quantity));
        }

        if (data.get("Commodity") != null)
        {
            String name = ((String) data.get("Commodity")).toUpperCase();
            Commodity commodity = Commodity.valueOf(name);
            int quantity = (-1) * ((int) data.get("Quantity"));
            context.getTransactions().add(new Pair<>(commodity, quantity));
        }
    }),

    MissionCompleted((context)->
    {
        Map<String, Object> data = context.getRawData();
        if (data.get("MaterialsReward") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> rewards = ((List<Map<String, Object>>) data.get("MaterialsReward"));
            rewards.forEach(reward->
            {
                String name = ((String) reward.get("Name")).toUpperCase();
                int count = ((int) reward.get("Count"));
                Material material = Material.valueOf(name);
                context.getTransactions().add(new Pair<>(material, count));
            });
        }

        if (data.get("CommodityReward") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> rewards = ((List<Map<String, Object>>) data.get("CommodityReward"));
            rewards.forEach(reward ->
            {
                String name = ((String) data.get("Name")).toUpperCase();
                int count = ((int) data.get("Count"));
                Commodity commodity = Commodity.valueOf(name);
                context.getTransactions().add(new Pair<>(commodity, count));
            });
        }

        if (data.get("Commodity") != null)
        {
            String name = ((String) data.get("Commodity"))
                    .replace("$","")
                    .replace("_Name;","")
                    .toUpperCase();

            int count = (-1) * ((int) data.get("Count"));
            Commodity commodity = Commodity.valueOf(name);
            context.getTransactions().add(new Pair<>(commodity, count));
        }
    }),

    TechnologyBroker((context)->
    {
        if (context.getRawData().get("Materials") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> materials = ((List<Map<String, Object>>) context.getRawData().get("Materials"));
            materials.forEach(materialCost ->
            {
                String name = ((String) materialCost.get("Name")).toUpperCase();
                int count = (-1) * ((int) materialCost.get("Count"));
                Material material = Material.valueOf(name);
                context.getTransactions().add(new Pair<>(material, count));
            });
        }

        if (context.getRawData().get("Commodities") != null)
        {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> commodityCosts = ((List<Map<String, Object>>) context.getRawData().get("Commodities"));
            commodityCosts.forEach(commodityCost ->
            {
                String name = ((String) commodityCost.get("Name")).toUpperCase();
                int count = ((int) commodityCost.get("Count"));
                Commodity commodity = Commodity.valueOf(name);
                context.getTransactions().add(new Pair<>(commodity, count));
            });
        }
    }),

    // material specific events
    MaterialCollected((context)->
    {
        String name = ((String) context.getRawData().get("Name")).toUpperCase();
        int count = ((int) context.getRawData().get("Count"));
        Material material = Material.valueOf(name);
        context.getTransactions().add(new Pair<>(material, count));
    }),

    MaterialDiscarded((context)->
    {
        String name = ((String) context.getRawData().get("Name")).toUpperCase();
        int count = (-1) * ((int) context.getRawData().get("Count"));
        Material material = Material.valueOf(name);
        context.getTransactions().add(new Pair<>(material, count));
    }),

    EngineerCraft((context)->
    {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> ingredients = ((List<Map<String, Object>>) context.getRawData().get("Ingredients"));
        ingredients.forEach(ingredient ->
        {
            String name = ((String) ingredient.get("Name")).toUpperCase();
            int count = (-1) * ((int) ingredient.get("Count"));
            Material material = Material.valueOf(name);
            context.getTransactions().add(new Pair<>(material, count));
        });
    }),

    MaterialTrade((context)->
    {
        @SuppressWarnings("unchecked")
        Map<String, Object> paid = ((Map<String, Object>) context.getRawData().get("Paid"));
        String paidName = ((String) paid.get("Material")).toUpperCase();
        Material paidMaterial = Material.valueOf(paidName);
        int paidQuantity = (-1) * ((int) paid.get("Quantity"));

        context.getTransactions().add(new Pair<>(paidMaterial, paidQuantity));

        @SuppressWarnings("unchecked")
        Map<String, Object> received = ((Map<String, Object>) context.getRawData().get("Received"));
        String receivedName = ((String) received.get("Material")).toUpperCase();
        Material receivedMaterial = Material.valueOf(receivedName);
        int receivedQuantity = ((int) received.get("Quantity"));

        context.getTransactions().add(new Pair<>(receivedMaterial, receivedQuantity));
    }),

    Synthesis((context)->
    {
        if (context.getRawData().get("Materials") == null) return;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> materials = ((List<Map<String, Object>>) context.getRawData().get("Materials"));
        materials.forEach(material->
        {
            String name = ((String) material.get("Name")).toUpperCase();
            int count = (-1) * ((int) material.get("Count"));
            Material mat = Material.valueOf(name);
            context.getTransactions().add(new Pair<>(mat, count));
        });
    }),

    ScientificResearch((context)->
    {
        String name = ((String) context.getRawData().get("Name")).toUpperCase();
        int count = ((int) context.getRawData().get("Count"));
        Material material = Material.valueOf(name);
        context.getTransactions().add(new Pair<>(material, count));
    }),

    // cargo specific events
    CollectCargo((context) ->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, 1));
    }),

    EjectCargo((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        int count = (-1) * ((int) context.getRawData().get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    MarketBuy((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        int count = ((int) context.getRawData().get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    MarketSell((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        int count = (-1) * ((int) context.getRawData().get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    MiningRefined((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, 1));
    }),

    CargoDepot((context)->
    {
        Map<String, Object> data = context.getRawData();
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
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    BuyDrones((context)->
    {
        int count = ((int) context.getRawData().get("Count"));
        context.getTransactions().add(new Pair<>(Commodity.DRONES, count));
    }),

    SellDrones((context)->
    {
        int count = (-1) * ((int) context.getRawData().get("Count"));
        context.getTransactions().add(new Pair<>(Commodity.DRONES, count));
    }),

    LaunchDrone((context)-> context.getTransactions().add(new Pair<>(Commodity.DRONES, -1))),

    PowerplayCollect((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        int count = ((int) context.getRawData().get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    PowerplayDeliver((context)->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        int count = (-1) * ((int) context.getRawData().get("Count"));
        Commodity commodity = Commodity.valueOf(name);
        context.getTransactions().add(new Pair<>(commodity, count));
    }),

    // stats
    LoadGame((context) ->
    {
        setStatFromData(context, PlayerStat.Commander);
        setStatFromData(context, PlayerStat.Credits);
        setStatFromData(context, PlayerStat.Game_Mode);

        if (context.getRawData().get("Group") != null)
        {
            setStatFromData(context, PlayerStat.Private_Group);
        }

        if (context.getRawData().get("Loan") != null && ((int) context.getRawData().get("Loan")) != 0)
        {
            setStatFromData(context, PlayerStat.Loan);
        }

        setStatFromData(context, PlayerStat.Fuel_Level);
        setStatFromData(context, PlayerStat.Fuel_Capacity);

        context.getUpdateFunction().call();
    }),

    Rank((context)->
    {
        setStatFromData(context, RankStat.Rank_Combat);
        setStatFromData(context, RankStat.Rank_Trade);
        setStatFromData(context, RankStat.Rank_Explore );
        setStatFromData(context, RankStat.Rank_Empire);
        setStatFromData(context, RankStat.Rank_Federation);
        setStatFromData(context, RankStat.Rank_CQC);
        context.getUpdateFunction().call();
    }),

    Progress((context)->
    {
        setStatFromData(context, RankStat.Progress_Combat);
        setStatFromData(context, RankStat.Progress_Trade);
        setStatFromData(context, RankStat.Progress_Explore);
        setStatFromData(context, RankStat.Progress_Empire);
        setStatFromData(context, RankStat.Progress_Federation);
        setStatFromData(context, RankStat.Progress_CQC);
        context.getUpdateFunction().call();
    }),

    Reputation((context)->
    {
        setStatFromData(context, RankStat.Reputation_Empire);
        setStatFromData(context, RankStat.Reputation_Federation);
        setStatFromData(context, RankStat.Reputation_Alliance);
        setStatFromData(context, RankStat.Reputation_Indpendent);
        context.getUpdateFunction().call();
    }),

    Loadout((context)->
    {
        JournalSyncTask.shipStats.forEach(context.getPlayerInventory()::removeStat);

        setStatFromData(context, PlayerStat.Ship);
        setStatFromData(context, PlayerStat.Ship_Name);
        setStatFromData(context, PlayerStat.Ship_ID);

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> modules = ((List<Map<String, Object>>) context.getRawData().get("Modules"));
        modules.stream().forEach(module -> setSlotFromData(context, module));
    }),

    ;

    private final Consumer<EventProcessingContext> eventConsumer;


    private static Statistic determineStatType(String statName)
    {
        Statistic statistic;

        try {statistic = CoreInternalSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = CosmeticSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = HardpointSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = OptionalInternalSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        return null;
    }

    private static void setStatFromData(EventProcessingContext context, Statistic stat)
    {
        context.getPlayerInventory().setStat(stat, stat.format(context.getRawData().get(stat.getKey())));
    }

    private static void setSlotFromData(EventProcessingContext context, Map<String, Object> data)
    {
        String slotName = ((String) data.get("Slot"));
        String itemName = ((String) data.get("Item"));
        Statistic statistic = determineStatType(slotName);
        if (statistic == null)
        {
            System.err.println("Error, unknown slot: " + slotName);
            return;
        }
        context.getPlayerInventory().setStat(statistic, itemName);
    }

    JournalEvent(Consumer<EventProcessingContext> eventConsumer)
    {
        this.eventConsumer = eventConsumer;
    }

    public void processEvent(EventProcessingContext eventProcessingContext)
    {
        eventConsumer.accept(eventProcessingContext);
    }
}
