package com.controllerface.cmdr_j.structures.journal;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.StarSystem;
import com.controllerface.cmdr_j.structures.commander.RankStat;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.journal.events.*;
import javafx.util.Pair;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.controllerface.cmdr_j.structures.journal.JournalEventTransactions.*;

/**
 * This enum defines all of the Journal API events that are currently supported. By convention, enum value names are
 * exact alphabetical matches for the JSON value string for the event it handles. This is a convenience that allows
 * support for an arbitrary event to be determined by using the valueOf() enum method. Internally, each enum value
 * contains the required processing logic for an event by defining a EventProcessingContext consumer function that
 * is executed on calls to the process() method.
 *
 * For every supported event, the logic to process it is defined as a lambda implementation and passed as a constructor
 * parameter for each event. This configuration helps consolidate all journal API processing code in one central
 * location, making it easy to share functionality among different methods where possible. The intention is that, for
 * maintenance and addition of new events, the bulk of the work to support them would be contained in this one class.
 *
 * Created by Controllerface on 4/16/2018.
 */

@SuppressWarnings("unchecked")
public enum JournalEvent
{
    /**
     * Main game load event: written at startup, when loading from main menu
     */
    LoadGame(new LoadGameHandler()),

    HullDamage(new HullDamageHandler()),

    ShieldState(new ShieldStateHandler()),

    HeatWarning(new HeatWarningHandler()),

    UnderAttack((context)->
    {
        String target = ((String) context.getRawData().get("Target"));
        String verb = target.equalsIgnoreCase("You") ? " are " : " is ";
        logCombatMessage(context, target + verb + "under attack");
    }),

    Bounty((context)->
    {
        String victim = ((String) context.getRawData().get("VictimFaction"));
        String target = ((String) context.getRawData().get("Target"));
        int reward;
        String benefactor;

        if (context.getRawData().get("Rewards") == null)
        {
            reward = ((int) context.getRawData().get("Reward"));
            benefactor = ((String) context.getRawData().get("Faction"));
        }
        else
        {
            reward = ((int) context.getRawData().get("TotalReward"));
            benefactor = ((List<Map<String, Object>>) context.getRawData().get("Rewards")).stream()
                    .map(r-> ((String) r.get("Faction")))
                    .collect(Collectors.joining(", ","Rewarding Faction(s): ",""));
        }

        logCombatMessage(context, "You destroyed " + victim + " " + target + " for " + reward + " credits paid by " + benefactor);
    }),

    FactionKillBond((context)->
    {
        String victim = ((String) context.getRawData().get("VictimFaction"));
        int reward = ((int) context.getRawData().get("Reward"));
        String benefactor = ((String) context.getRawData().get("AwardingFaction"));

        logCombatMessage(context, "You destroyed a " + victim + " for " + reward + " credits paid by " + benefactor);
    }),

    Market((context)->
    {
        //todo: handle this
        System.out.println("Market");
        if (context.getRawData().get("Items")==null) return;

        ((List<Map<String, Object>>) context.getRawData().get("Items")).stream()
                .map(item ->
                {
                    String name = ((String) item.get("Name"));
                    if (name == null) return null;

                    String c = name.replace("$", "").replace("_name;", "").toUpperCase();
                    Commodity commodity = Commodity.valueOf(c);
                    String x = commodity.getLocalizedName();
                    int buy = ((int) item.get("BuyPrice"));
                    int sell = ((int) item.get("SellPrice"));
                    boolean imports = ((boolean) item.get("Consumer"));
                    boolean exports = ((boolean) item.get("Producer"));

                    Set<String> modifiers = new HashSet<>();
                    if (imports) modifiers.add("Imports");
                    if (exports) modifiers.add("Exports");

                    String m = modifiers.stream().collect(Collectors.joining(" and "));


                    return x + " :: Buy: "+ buy + " :: Sell: "+ sell + " :: Market: " + m;
                })
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }),

    USSDrop((context ->
    {
        String type = ((String) context.getRawData().get("USSType_Localised"));
        Integer threatLevel = ((Integer) context.getRawData().get("USSThreat"));
        logTravelMessage(context, "Unidentified Signal Source :: " +  type + " :: Threat Level " + threatLevel);
    })),

    Docked((context ->
    {
        String name = ((String) context.getRawData().get("StationName"));
        List<Map<String, Object>> economies = ((List<Map<String,Object>>) context.getRawData().get("StationEconomies"));
        String economy = economies.stream()
                .map(economyType -> ((String) economyType.get("Name_Localised")))
                .collect(Collectors.joining(", "));

        logTravelMessage(context, "Docked at " + name + " :: " + economy + " Economy");

        context.getCommanderData().setStation(name);
        context.getCommanderData().setEconomy(economy);
    })),

    Undocked((context ->
    {
        String name = ((String) context.getRawData().get("StationName"));
        logTravelMessage(context, "Leaving " + name);

        context.getCommanderData().setStation("Undocked");
        context.getCommanderData().setEconomy("No Market");
    })),

    StartJump((context ->
    {
        String jumpType = ((String) context.getRawData().get("JumpType"));

        logTravelMessage(context, jumpType + " Jump Initiated");

        String system = ((String) context.getRawData().get("StarSystem"));
        if (system !=null)
        {
            String currentSystem = context.getCommanderData().getLocation().getStarSystem().getSystemName();
            logTravelMessage(context, "Leaving the " + currentSystem + " System; Jumping to " + system);
        }
    })),

    SupercruiseEntry((context ->
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, system + " :: Entered Supercruise");
    })),

    SupercruiseExit((context ->
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String body = ((String) context.getRawData().get("Body"));
        logTravelMessage(context, system + " :: Exited Supercruise Near " + body);
    })),

    Location((context ->
    {
        String name = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, "Spawned in the " + name + " System");
        List<Double> coordinates = ((List<Double>) context.getRawData().get("StarPos"));
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(1), coordinates.get(2));
        context.getCommanderData().setLocation(system);
    })),

    FSDJump((context ->
    {
        String name = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, "Arrived in the " + name + " System");
        List<Double> coordinates = ((List<Double>) context.getRawData().get("StarPos"));
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(1), coordinates.get(2));
        context.getCommanderData().setLocation(system);
    })),

    /**
     * Main cargo event: written at startup, when loading from main menu
     */
    Cargo((context) ->
    {
        logInventoryMessage(context, "Reloading Cargo");

        context.getCommanderData().clearCargo();

        ((List<Map<String, Object>>) context.getRawData().get("Inventory")).stream()
                .forEach(item -> adjustCommodityCount(context, item));
    }),

    /**
     * Main material storage event: written at startup, when loading from main menu
     */
    Materials((context)->
    {
        logInventoryMessage(context, "Reloading Material Storage");

        context.getCommanderData().clearMaterials();

        Map<String, Object> data = context.getRawData();

        ((List<Map<String, Object>>) data.get("Raw")).stream()
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Manufactured")).stream()
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Encoded")).stream()
                .forEach(item -> adjustMaterialCount(context, item));
    }),

    /**
     * Rank event: written at startup, when loading from main menu
     */
    Rank((context) ->
    {
        logGeneralMessage(context, "Reloading Current Rank Status");

        setStatFromData(context, RankStat.Rank_Combat);
        setStatFromData(context, RankStat.Rank_Trade);
        setStatFromData(context, RankStat.Rank_Explore );
        setStatFromData(context, RankStat.Rank_Empire);
        setStatFromData(context, RankStat.Rank_Federation);
        setStatFromData(context, RankStat.Rank_CQC);
    }),

    /**
     * Rank progress event: written at startup, when loading from main menu
     */
    Progress((context) ->
    {
        logGeneralMessage(context, "Reloading Rank Progress");

        setStatFromData(context, RankStat.Progress_Combat);
        setStatFromData(context, RankStat.Progress_Trade);
        setStatFromData(context, RankStat.Progress_Explore);
        setStatFromData(context, RankStat.Progress_Empire);
        setStatFromData(context, RankStat.Progress_Federation);
        setStatFromData(context, RankStat.Progress_CQC);
    }),

    /**
     * Reputation event: written at startup, when loading from main menu
     */
    Reputation((context) ->
    {
        logGeneralMessage(context, "Reloading Faction Reputation");

        setStatFromData(context, RankStat.Reputation_Empire);
        setStatFromData(context, RankStat.Reputation_Federation);
        setStatFromData(context, RankStat.Reputation_Alliance);
        setStatFromData(context, RankStat.Reputation_Independent);
    }),

    SetUserShipName((context) ->
    {
        logLoadoutMessage(context, "Reloading Ship Name");
        String shipName = ((String) context.getRawData().get("UserShipName"));
        String shipID = ((String) context.getRawData().get("UserShipId"));
        context.getCommanderData().getStarShip().setGivenName(shipName);
        context.getCommanderData().getStarShip().setShipID(shipID);
    }),

    /**
     * Loadout event: written at startup, when loading from main menu, and after being destroyed in an SRV and
     * teleporting back to your ship.
     */
    Loadout(new LoadoutHandler()),

    /**
     * Written when contributing items to an engineer in order to gain their favor
     */
    EngineerContribution((context)->
    {
        logEngineeringMessage(context, "Engineering Contribution");

        Map<String, Object> data = context.getRawData();

        if (data.get("Material") != null) adjustMaterialQuantityDown(context, data);

        if (data.get("Commodity") != null) adjustCommodityQuantityDown(context, data);
    }),

    /**
     * Written when a mission is completed
     */
    MissionCompleted((context)->
    {
        logGeneralMessage(context, "Mission Completed");

        Map<String, Object> data = context.getRawData();

        if (data.get("MaterialsReward") != null)
        {
            ((List<Map<String, Object>>) data.get("MaterialsReward"))
                    .forEach(reward -> adjustMaterialCount(context, reward));
        }

        if (data.get("CommodityReward") != null)
        {
            ((List<Map<String, Object>>) data.get("CommodityReward"))
                    .forEach(reward -> adjustCommodityCount(context, reward));
        }

        if (data.get("Commodity") != null)
        {
            String name = ((String) data.get("Commodity"))
                    .replace("$","")
                    .replace("_Name;","")
                    .toUpperCase();

            Integer count = ((Integer) data.get("Count"));
            adjustDown(context, new Pair<>(name, count), AdjustmentType.COMMODITY);
        }
    }),

    /**
     * Written when unlocking an item from a tech broker
     */
    TechnologyBroker((context)->
    {
        logLoadoutMessage(context, "Tech Broker Item Unlocked");

        if (context.getRawData().get("Materials") != null)
        {
            ((List<Map<String, Object>>) context.getRawData().get("Materials"))
                    .forEach(materialCost -> adjustMaterialCountDown(context, materialCost));
        }

        if (context.getRawData().get("Commodities") != null)
        {
            ((List<Map<String, Object>>) context.getRawData().get("Commodities"))
                    .forEach(commodityCost -> adjustCommodityCountDown(context, commodityCost));
        }
    }),

    /**
     * Written when materials are collected
     */
    MaterialCollected((context) ->
    {
        logInventoryMessage(context, "Material Collected");
        adjustMaterialCount(context, context.getRawData());
    }),

    /**
     * Written when materials are discarded
     */
    MaterialDiscarded((context) ->
    {
        logInventoryMessage(context, "Material Discarded");
        adjustMaterialCountDown(context, context.getRawData());
    }),

    /**
     * Written when a engineering mod or experimental effect is crafted
     */
    EngineerCraft((context) ->
    {
        logEngineeringMessage(context, "Engineering Enhancement Costs :");
        processEngineerUpgrade(context);
    }),

    /**
     * Written when using a material trader to trade one type of material for another
     */
    MaterialTrade((context) ->
    {
        logInventoryMessage(context, "Material Trade Completed");
        adjustMaterialQuantity(context, ((Map<String, Object>) context.getRawData().get("Received")));
        adjustMaterialQuantityDown(context, ((Map<String, Object>) context.getRawData().get("Paid")));
    }),

    /**
     * Written when synthesizing items
     */
    Synthesis((context) ->
    {
        String name = ((String) context.getRawData().get("Name"));
        logInventoryMessage(context, "Synthesis Complete: " + name);

        // todo: need a way to check max cargo size. This will be "up to four" limpets, depending on cargo space
        if (name.contains("Limpet")) adjust(context, Commodity.DRONES, 4);
        ((List<Map<String, Object>>) context.getRawData().get("Materials"))
                .forEach(material -> adjustMaterialCountDown(context, material));
    }),

    /**
     * Written when contributing materials to a community goal
     */
    ScientificResearch((context) ->
    {
        logInventoryMessage(context, "Scientific Research Contribution Completed");
        adjustMaterialCountDown(context, context.getRawData());
    }),

    /**
     * Written when collecting commodity items
     */
    CollectCargo((context) ->
    {
        logInventoryMessage(context, "Cargo Collected");
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        adjust(context, new Pair<>(name, 1), AdjustmentType.COMMODITY);
    }),

    /**
     * Written when ejecting commodities from cargo
     */
    EjectCargo((context) ->
    {
        logInventoryMessage(context, "Cargo Ejected");
        adjustCommodityTypeDown(context, context.getRawData());
    }),

    /**
     * Written when buying commodities from a market
     */
    MarketBuy((context) ->
    {
        logInventoryMessage(context, "Commodity Purchased");
        adjustCommodityType(context, context.getRawData());
    }),

    /**
     * Written when celling commodities to a market
     */
    MarketSell((context) ->
    {
        logInventoryMessage(context, "Commodity Sold");
        adjustCommodityTypeDown(context, context.getRawData());
    }),

    /**
     * Written when a commodity has been refined through collection of mining fragments
     */
    MiningRefined((context) ->
    {
        logInventoryMessage(context, "Commodity Refined");
        String name = ((String) context.getRawData().get("Type")).replace("$","").replace("_name;","").toUpperCase();
        adjust(context, new Pair<>(name, 1), AdjustmentType.COMMODITY);
    }),

    /**
     * Written when a cargo delivery wing mission status updates
     */
    CargoDepot((context) ->
    {
        String updateType = ((String) context.getRawData().get("UpdateType"));
        Pair<String, Integer> pair = extractPair(context.getRawData(), "CargoType", "Count");

        switch (updateType)
        {
            case "Deliver":
                logInventoryMessage(context, "Cargo Delivered");
                adjustDown(context, pair, AdjustmentType.COMMODITY);
                break;

            case "Collect":
                logInventoryMessage(context, "Cargo Collected");
                adjust(context, pair, AdjustmentType.COMMODITY);
                break;
        }
    }),

    /**
     * Written when buying limpet drones
     */
    BuyDrones((context) ->
    {
        logInventoryMessage(context, "Limpet Drones Purchased");
        adjust(context, Commodity.DRONES, ((int) context.getRawData().get("Count")));
    }),

    /**
     * Written when selling limpet drones
     */
    SellDrones((context) ->
    {
        logInventoryMessage(context, "Limpet Drones Sold");
        adjustDown(context, Commodity.DRONES, ((int) context.getRawData().get("Count")));
    }),

    /**
     * Written when launching a limpet drone
     */
    LaunchDrone((context) ->
    {
        logInventoryMessage(context, "Limpet Drone Launched");
        adjustDown(context, Commodity.DRONES, 1);
    }),

    /**
     * Written when collecting powerplay specific cargo items
     */
    PowerplayCollect((context) ->
    {
        logInventoryMessage(context, "PowerPlay Item Collected");
        adjustCommodityType(context, context.getRawData());
    }),

    /**
     * Written when delivering powerplay specific cargo items
     */
    PowerplayDeliver((context) ->
    {
        logInventoryMessage(context, "PowerPlay Item Delivered");
        adjustCommodityTypeDown(context, context.getRawData());
    }),

    /**
     * Written when a currently equipped module is stored, removing it from the current ship
     */
    ModuleStore((context) ->
    {
        logInventoryMessage(context, "Module Stored");
        JournalEventTransactions.emptySlotFromData(context);
    }),

    /**
     * Written when a currently equipped module is sold, removing it from the current ship
     */
    ModuleSell((context) ->
    {
        logInventoryMessage(context, "Module Sold");
        JournalEventTransactions.emptySlotFromData(context);
    }),

    /**
     * Written when buying a new module, equipping it to the current ship
     */
    ModuleBuy((context ->
    {
        logInventoryMessage(context, "Module Purchased");
        processBuyModule(context);
    })),

    /**
     * Written when retrieving a module from storage, equipping it to the current ship
     */
    ModuleRetrieve((context ->
    {
        logInventoryMessage(context, "Module Retrieved from Storage");
        processRetrieveModule(context);
    })),

    ;

    /**
     * Stores the event processing logic for the corresponding event
     */
    private final Consumer<EventProcessingContext> eventConsumer;
    private final JournalEventHandler event;

    JournalEvent(Consumer<EventProcessingContext> eventConsumer)
    {
        this.eventConsumer = eventConsumer;
        this.event = null;
    }

    JournalEvent(JournalEventHandler event)
    {
        this.eventConsumer = null;
        this.event = event;
    }

    /**
     * Executes a specified event consumer function containing the required processing logic for an event
     *
     * @param eventProcessingContext the current event processing context
     */
    public void process(EventProcessingContext eventProcessingContext)
    {
        if (eventConsumer == null) event.handle(eventProcessingContext);
        else eventConsumer.accept(eventProcessingContext);
    }
}
