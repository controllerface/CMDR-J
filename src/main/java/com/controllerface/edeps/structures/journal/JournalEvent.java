package com.controllerface.edeps.structures.journal;

import com.controllerface.edeps.*;
import com.controllerface.edeps.data.ModifierData;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.commander.PlayerStat;
import com.controllerface.edeps.structures.commander.RankStat;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.modules.*;
import com.controllerface.edeps.structures.equipment.ships.*;
import com.controllerface.edeps.threads.JournalSyncTask;
import com.controllerface.edeps.threads.UserTransaction;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

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
 * Created by Stephen on 4/16/2018.
 */

@SuppressWarnings("unchecked")
public enum JournalEvent
{
    /**
     * Main game load event: written at startup, when loading from main menu
     */
    LoadGame((context) ->
    {
        setStatFromData(context, PlayerStat.Commander);
        setStatFromData(context, PlayerStat.Credits);
        setStatFromData(context, PlayerStat.Game_Mode);

        if (context.getRawData().get("Group") != null) setStatFromData(context, PlayerStat.Private_Group);
        if (context.getRawData().get("Loan") != null) setStatFromData(context, PlayerStat.Loan);

        setStatFromData(context, PlayerStat.Fuel_Level);
        setStatFromData(context, PlayerStat.Fuel_Capacity);

        setStatFromData(context, PlayerStat.Ship);
        setStatFromData(context, PlayerStat.Ship_Name);
        setStatFromData(context, PlayerStat.Ship_Ident);

        context.getUpdateFunction().call();
    }),

    /**
     * Main cargo event: written at startup, when loading from main menu
     */
    Cargo((context) ->
    {
        context.getCommanderData().clearCargo();

        ((List<Map<String, Object>>) context.getRawData().get("Inventory")).stream()
                .forEach(item -> adjustCommodityCount(context, item));

        context.getUpdateFunction().call();
    }),

    /**
     * Main material storage event: written at startup, when loading from main menu
     */
    Materials((context)->
    {
        context.getCommanderData().clearMaterials();

        Map<String, Object> data = context.getRawData();

        ((List<Map<String, Object>>) data.get("Raw")).stream()
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Manufactured")).stream()
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Encoded")).stream()
                .forEach(item -> adjustMaterialCount(context, item));

        context.getUpdateFunction().call();
    }),

    /**
     * Rank event: written at startup, when loading from main menu
     */
    Rank((context) ->
    {
        setStatFromData(context, RankStat.Rank_Combat);
        setStatFromData(context, RankStat.Rank_Trade);
        setStatFromData(context, RankStat.Rank_Explore );
        setStatFromData(context, RankStat.Rank_Empire);
        setStatFromData(context, RankStat.Rank_Federation);
        setStatFromData(context, RankStat.Rank_CQC);

        context.getUpdateFunction().call();
    }),

    /**
     * Rank progress event: written at startup, when loading from main menu
     */
    Progress((context) ->
    {
        setStatFromData(context, RankStat.Progress_Combat);
        setStatFromData(context, RankStat.Progress_Trade);
        setStatFromData(context, RankStat.Progress_Explore);
        setStatFromData(context, RankStat.Progress_Empire);
        setStatFromData(context, RankStat.Progress_Federation);
        setStatFromData(context, RankStat.Progress_CQC);

        context.getUpdateFunction().call();
    }),

    /**
     * Reputation event: written at startup, when loading from main menu
     */
    Reputation((context) ->
    {
        setStatFromData(context, RankStat.Reputation_Empire);
        setStatFromData(context, RankStat.Reputation_Federation);
        setStatFromData(context, RankStat.Reputation_Alliance);
        setStatFromData(context, RankStat.Reputation_Independent);

        context.getUpdateFunction().call();
    }),

    /**
     * Loadout event: written at startup, when loading from main menu, and after being destroyed in an SRV and
     * teleporting back to your ship.
     */
    Loadout((context) ->
    {
        JournalSyncTask.shipStats.forEach(context.getCommanderData()::removeStat);

        setStatFromData(context, CoreInternalSlot.Ship);
        setStatFromData(context, CoreInternalSlot.ShipName);
        setStatFromData(context, CoreInternalSlot.ShipIdent);

        String shipName = context.getCommanderData().getStat(CoreInternalSlot.Ship);
        Ship ship = null;
        try
        {
            ship = Ship.findShip(shipName);
            context.getCommanderData().setShip(ship);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        ((List<Map<String, Object>>) context.getRawData().get("Modules")).stream()
                .forEach(module -> setSlotFromLoadout(context, module));

        context.getUpdateFunction().call();
    }),

    /**
     * Written when contributing items to an engineer in order to gain their favor
     */
    EngineerContribution((context)->
    {
        Map<String, Object> data = context.getRawData();

        if (data.get("Material") != null) adjustMaterialQuantityDown(context, data);

        if (data.get("Commodity") != null) adjustCommodityQuantityDown(context, data);
    }),

    /**
     * Written when a mission is completed
     */
    MissionCompleted((context)->
    {
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
    MaterialCollected((context)-> adjustMaterialCount(context, context.getRawData())),

    /**
     * Written when materials are discarded
     */
    MaterialDiscarded((context)-> adjustMaterialCountDown(context, context.getRawData())),

    /**
     * Written when a engineering mod or experimental effect is crafted
     */
    EngineerCraft((context) ->
    {
        Map<String, Object> rawData = context.getRawData();

        // remove the materials used in the crafting process
        ((List<Map<String, Object>>) rawData.get("Ingredients"))
                .forEach(ingredient -> adjustMaterialCountDown(context, ingredient));

        String modificationEffect = ((String) rawData.get("BlueprintName"));
        String experimentalEffect = ((String) rawData.get("ApplyExperimentalEffect"));
        String moduleName = ((String) rawData.get("Module"));

        ShipModule module = determineModuleType(moduleName);
        if (module == null)
        {
            if (module == null) System.err.println("Ignoring Module: " + moduleName);
            return;
        }

        // if this crafting event is for applying an experimental effect
        if (experimentalEffect != null)
        {
            ProcurementType experimentalType = module.experimentalType();
            if (experimentalType == null)
            {
                System.err.println("No experimental effects are registered for: " + module.displayText());
                return;
            }

            ProcurementRecipe experimentalRecipe = ExperimentalRecipe.valueOf(experimentalEffect);
            adjustBlueprintDown(context, experimentalType, experimentalRecipe, 1);
        }
        else
        {
            ProcurementType modificationType = module.modificationType();
            if (modificationType == null)
            {
                System.err.println("No engineering modifications are registered for: " + module.displayText());
                return;
            }

            int grade = ((int) rawData.get("Level"));

            ProcurementBlueprint blueprint = ModificationBlueprint.valueOf(modificationEffect);
            ProcurementRecipe modificationRecipe = blueprint.recipeStream()
                    .filter(recipe -> recipe.getGrade().getNumericalValue() == grade)
                    .findFirst().orElse(null);


            // findRecipe() or something like that

            if (modificationRecipe == null)
            {
                System.err.println("No recipe of grade: " + grade + " found for blueprint: " + blueprint +
                        "\n Attempting to fall back to any existing recipe ");
                modificationRecipe = blueprint.recipeStream().findAny().orElse(null);
                if (modificationRecipe == null)
                {
                    throw new RuntimeException(" Could not find any recipes for: "
                            + blueprint + " might need to update...");
                }
            }

            adjustBlueprintDown(context, modificationType, modificationRecipe, 1);
        }

        String slotKey = ((String) rawData.get("Slot"));
        Statistic slot = determineStatType(slotKey);
        if (slot == null)
        {
            if (slot == null) System.err.println("Ignoring Slot: " + slotKey);
            return;
        }
        context.getCommanderData().setStat(slot, moduleName);
        setSlotFromData(context, slot, module, rawData);
    }),

    /**
     * Written when using a material trader to trade one type of material for another
     */
    MaterialTrade((context) ->
    {
        adjustMaterialQuantity(context, ((Map<String, Object>) context.getRawData().get("Received")));
        adjustMaterialQuantityDown(context, ((Map<String, Object>) context.getRawData().get("Paid")));
    }),

    /**
     * Written when synthesizing items
     */
    Synthesis((context) -> ((List<Map<String, Object>>) context.getRawData().get("Materials"))
            .forEach(material -> adjustMaterialCountDown(context, material))),

    /**
     * Written when contributing materials to a community goal
     */
    ScientificResearch((context) -> adjustMaterialCountDown(context, context.getRawData())),

    /**
     * Written when collecting commodity items
     */
    CollectCargo((context) ->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        adjust(context, new Pair<>(name, 1), AdjustmentType.COMMODITY);
    }),

    /**
     * Written when ejecting commodities from cargo
     */
    EjectCargo((context) -> adjustCommodityTypeDown(context, context.getRawData())),

    /**
     * Written when buying commodities from a market
     */
    MarketBuy((context) -> adjustCommodityType(context, context.getRawData())),

    /**
     * Written when celling commodities to a market
     */
    MarketSell((context) -> adjustCommodityTypeDown(context, context.getRawData())),

    /**
     * Written when a commodity has been refined through collection of mining fragments
     */
    MiningRefined((context) ->
    {
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
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
                adjustDown(context, pair, AdjustmentType.COMMODITY);
                break;

            case "Collect":
                adjust(context, pair, AdjustmentType.COMMODITY);
                break;
        }
    }),

    /**
     * Written when buying limpet drones
     */
    BuyDrones((context) -> adjust(context, Commodity.DRONES, ((int) context.getRawData().get("Count")))),

    /**
     * Written when selling limpet drones
     */
    SellDrones((context) -> adjustDown(context, Commodity.DRONES, ((int) context.getRawData().get("Count")))),

    /**
     * Written when launching a limpet drone
     */
    LaunchDrone((context) -> adjustDown(context, Commodity.DRONES, 1)),

    /**
     * Written when collecting powerplay specific cargo items
     */
    PowerplayCollect((context) -> adjustCommodityType(context, context.getRawData())),

    /**
     * Written when delivering powerplay specific cargo items
     */
    PowerplayDeliver((context) -> adjustCommodityTypeDown(context, context.getRawData())),

    ;

    /**
     * Internal enum, used to make the adjustment methods easier for both material and commodity adjustments
     */
    private enum AdjustmentType
    {
        COMMODITY,
        MATERIAL
    }

    /**
     * Stores the event processing logic for the corresponding event
     */
    private final Consumer<EventProcessingContext> eventConsumer;

    JournalEvent(Consumer<EventProcessingContext> eventConsumer)
    {
        this.eventConsumer = eventConsumer;
    }

    /**
     * Executes a specified event consumer function containing the required processing logic for an event
     *
     * @param eventProcessingContext the current event processing context
     */
    public void process(EventProcessingContext eventProcessingContext)
    {
        eventConsumer.accept(eventProcessingContext);
    }

    /**
     * Determines what statistic type is being represented by a given String name, and returns the matching object, or
     * null if the name is not recognized.
     *
     * @param statName the String name of a Statistic enum type
     * @return the Statistic enum value matching the provided name, or null if the name is not valid
     */
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

    private static ModificationBlueprint determineModificationBlueprint(String modname)
    {
        ModificationBlueprint modificationBlueprint;

        try
        {
            modificationBlueprint = ModificationBlueprint.valueOf(modname);
        }
        catch (Exception e)
        {
            modificationBlueprint = null;
        }
        return modificationBlueprint;
    }


    private static ExperimentalRecipe determineExperimentalRecipe(String expname)
    {
        ExperimentalRecipe modificationBlueprint;

        try
        {
            modificationBlueprint = ExperimentalRecipe.valueOf(expname);
        }
        catch (Exception e)
        {
            modificationBlueprint = null;
        }
        return modificationBlueprint;
    }


    private static ShipModule determineModuleType(String moduleName)
    {
        ShipModule module;

        try {module = HardpointModule.findModule(moduleName);}
        catch (Exception e) {module = null;}
        if (module != null) return module;

        try {module = CoreInternalModule.findModule(moduleName);}
        catch (Exception e) {module = null;}
        if (module != null) return module;

        try {module = OptionalInternalModule.findModule(moduleName);}
        catch (Exception e) {module = null;}
        if (module != null) return module;

        try {module = OptionalInternalShieldModule.findModule(moduleName);}
        catch (Exception e) {module = null;}
        if (module != null) return module;

        try {module = Cosmetic.findCosmetic(moduleName);}
        catch (Exception e) {module = null;}
        if (module != null) return module;

        return null;
    }

    /**
     * Extracts a Pair<String, Integer> pair from a raw JSON object, where the String key and Integer value are
     * extracted from the ray JSON object by using the keys "Name" and "Count" respectively
     *
     * @param data raw JSON data
     * @return the extracted Pair<String, Integer> object
     */
    private static Pair<String, Integer> extractNameCountPair(Map<String, Object> data)
    {
        return extractPair(data, "Name", "Count");
    }

    /**
     * Extracts a Pair<String, Integer> pair from a raw JSON object, where the String key and Integer value are
     * extracted from the ray JSON object by using the keys "Type" and "Count" respectively
     *
     * @param data raw JSON data
     * @return the extracted Pair<String, Integer> object
     */
    private static Pair<String, Integer> extractTypeCountPair(Map<String, Object> data)
    {
        return extractPair(data, "Type", "Count");
    }

    /**
     * Extracts a Pair<String, Integer> pair from a raw JSON object, where the String key and Integer value are
     * extracted from the ray JSON object by using the keys "Material" and "Quantity" respectively
     *
     * @param data raw JSON data
     * @return the extracted Pair<String, Integer> object
     */
    private static Pair<String, Integer> extractMaterialQuantityPair(Map<String, Object> data)
    {
        return extractPair(data, "Material", "Quantity");
    }

    /**
     * Extracts a Pair<String, Integer> pair from a raw JSON object, where the String key and Integer value are
     * extracted from the ray JSON object by using the keys "Commodity" and "Quantity" respectively
     *
     * @param data raw JSON data
     * @return the extracted Pair<String, Integer> object
     */
    private static Pair<String, Integer> extractCommodityQuantityPair(Map<String, Object> data)
    {
        return extractPair(data, "Commodity", "Quantity");
    }

    /**
     * Extracts a Pair<String, Integer> pair from a raw JSON object, where the String key and Integer value are
     * extracted from the ray JSON object by using the value of the provided keyName and valueName arguments
     *
     * @param data raw JSON data
     * @param keyName key string to use to extract the returned pair's key name from the raw JSON object
     * @param valueName key string to use to extract the returned pair's value from the raw JSON object
     * @return the extracted Pair<String, Integer> object
     */
    private static Pair<String, Integer> extractPair(Map<String, Object> data, String keyName, String valueName)
    {
        return new Pair<>(data.get(keyName).toString().toUpperCase(), Integer.parseInt(data.get(valueName).toString()));
    }

    /**
     * Sets a Statistic value on a context specific CommanderData object using a context specific raw JSON object
     * to extract the stat value
     *
     * @param context the current event processing context
     * @param stat the statistic type to set the value of
     */
    private static void setStatFromData(EventProcessingContext context, Statistic stat)
    {
        context.getCommanderData().setStat(stat, stat.format(context.getRawData().get(stat.getKey())));
    }

    private static void setSlotFromData(EventProcessingContext context,
                                        Statistic slot,
                                        ShipModule module,
                                        Map<String, Object> engineering)
    {
        Integer level = 0;
        Double quality = 0d;
        String modificationName = null;
        String experimentalEffectName = null;
        ModificationBlueprint modificationBlueprint = null;
        ExperimentalRecipe experimentalRecipe = null;

        List<ModifierData> modifiers = new ArrayList<>();

        if (engineering != null)
        {
            modificationName = ((String) engineering.get("BlueprintName"));
            experimentalEffectName = ((String) engineering.get("ExperimentalEffect"));
            modificationBlueprint = determineModificationBlueprint(modificationName);
            experimentalRecipe = determineExperimentalRecipe(experimentalEffectName);

            level = ((Integer) engineering.get("Level"));
            quality = ((Double) engineering.get("Quality"));
            ((List<Map<String, Object>>) engineering.get("Modifiers"))
                    .forEach(modifier ->
                    {
                        ItemEffect effect = ItemEffect.valueOf(((String) modifier.get("Label")));
                        double value = ((double) modifier.get("Value"));
                        double originalValue = ((double) modifier.get("OriginalValue"));
                        boolean lessIsGood = ((int) modifier.get("LessIsGood")) == 1;
                        modifiers.add(new ModifierData(effect, value, originalValue, lessIsGood));
                    });
        }


        if (modificationName != null && modificationBlueprint == null)
        {
            System.out.println("Unknown Modification:" + modificationName);
            modificationBlueprint = ModificationBlueprint.Unknown;
        }

        if (experimentalEffectName != null && experimentalRecipe == null)
        {
            System.out.println("Unknown Experimental Effect:" + experimentalEffectName);
            experimentalRecipe = ExperimentalRecipe.Unknown;
        }


        ShipModuleData shipModuleData = new ShipModuleData.Builder()
                .setModuleName(slot)
                .setModule(module)
                .setModifiers(modifiers)
                .setModificationBlueprint(modificationBlueprint)
                .setExperimentalEffectRecipe(experimentalRecipe)
                .setLevel(level)
                .setQuality(quality)
                .build();

        context.getCommanderData().setShipModule(shipModuleData);
    }

    /**
     * Sets a ship internal slot specific Statistic value on a context specific CommanderData object using a context
     * specific raw JSON object to extract the slot name and value
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the slot name and value
     */
    private static void setSlotFromLoadout(EventProcessingContext context, Map<String, Object> data)
    {
        String slotKey = ((String) data.get("Slot"));
        String moduleKey = ((String) data.get("Item"));

        Statistic slot = determineStatType(slotKey);
        ShipModule module = determineModuleType(moduleKey);
        Map<String, Object> engineering = ((Map<String, Object>) data.get("Engineering"));

        if (slot == null || module == null)
        {
            if (slot == null) System.err.println("Ignoring Slot: " + slotKey);
            if (module == null) System.err.println("Ignoring Module: " + moduleKey);
            return;
        }

        // useful for debugging
        context.getCommanderData().setStat(slot, moduleKey);

        // modules may not have any engineering data. If so, just return
        //if (engineering == null) return;

        setSlotFromData(context, slot, module, engineering);
    }

    /**
     * Increments the count of a commodity in a context specific CommanderData object
     *
     * [Type, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    private static void adjustCommodityType(EventProcessingContext context, Map<String, Object> data)
    {
        adjust(context, extractTypeCountPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Decrements the count of a commodity in a context specific CommanderData object
     *
     * [Type, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    private static void adjustCommodityTypeDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractTypeCountPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Increments the count of a commodity in a context specific CommanderData object
     *
     * [Name, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    private static void adjustCommodityCount(EventProcessingContext context, Map<String, Object> data)
    {
        adjust(context, extractNameCountPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Decrements the count of a commodity in a context specific CommanderData object
     *
     * [Name, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    private static void adjustCommodityCountDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractNameCountPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Increments the count of a material in a context specific CommanderData object
     *
     * [Name, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the material type and value
     */
    private static void adjustMaterialCount(EventProcessingContext context, Map<String, Object> data)
    {
        adjust(context, extractNameCountPair(data), AdjustmentType.MATERIAL);
    }

    /**
     * Decrements the count of a material in a context specific CommanderData object
     *
     * [Name, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the material type and value
     */
    private static void adjustMaterialCountDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractNameCountPair(data), AdjustmentType.MATERIAL);
    }

    /**
     * Increments the count of a material in a context specific CommanderData object
     *
     * [Material, Quantity] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the material type and value
     */
    private static void adjustMaterialQuantity(EventProcessingContext context, Map<String, Object> data)
    {
        adjust(context, extractMaterialQuantityPair(data), AdjustmentType.MATERIAL);
    }

    /**
     * Decrements the count of a material in a context specific CommanderData object
     *
     * [Material, Quantity] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the material type and value
     */
    private static void adjustMaterialQuantityDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractMaterialQuantityPair(data), AdjustmentType.MATERIAL);
    }

    /**
     * Decrements the count of a commodity in a context specific CommanderData object
     *
     * [Material, Quantity] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    private static void adjustCommodityQuantityDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractCommodityQuantityPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Increments the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param pair a Pair<String, Integer> object describing the item type and amount to adjust
     * @param adjustmentType either COMMODITY or MATERIAL based on the type of item to adjust
     */
    private static void adjust(EventProcessingContext context, Pair<String, Integer> pair, AdjustmentType adjustmentType)
    {
        ProcurementCost cost;
        switch (adjustmentType)
        {
            case COMMODITY:
                cost = Commodity.valueOf(pair.getKey());
                break;

            case MATERIAL:
                cost = Material.valueOf(pair.getKey());
                break;

            default: return;
        }
        adjust(context, cost, pair.getValue());
    }

    /**
     * Decrements the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param pair a Pair<String, Integer> object describing the item type and amount to adjust
     * @param adjustmentType either COMMODITY or MATERIAL based on the type of item to adjust
     */
    private static void adjustDown(EventProcessingContext context, Pair<String, Integer> pair, AdjustmentType adjustmentType)
    {
        adjust(context, new Pair<>(pair.getKey(), -1 * pair.getValue()), adjustmentType);
    }

    /**
     * Increments the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param cost the item type to adjust
     * @param count the amount by which to adjust the provided item
     */
    private static void adjust(EventProcessingContext context, ProcurementCost cost, int count)
    {
        UserTransaction transaction = new UserTransaction(count, cost);
        context.getTransactions().add(transaction);
    }

    private static void adjustBlueprint(EventProcessingContext context,
                                        ProcurementType procurementType,
                                        ProcurementRecipe procurementRecipe,
                                        int amount)
    {
        Pair<ProcurementType, ProcurementRecipe> bluePrint = new Pair<>(procurementType, procurementRecipe);
        UserTransaction transaction = new UserTransaction(amount, bluePrint);
        context.getTransactions().add(transaction);
    }

    private static void adjustBlueprintDown(EventProcessingContext context,
                                            ProcurementType procurementType,
                                            ProcurementRecipe procurementRecipe,
                                            int amount)
    {
        adjustBlueprint(context,procurementType,procurementRecipe, (-1 * amount));
    }

    /**
     * Decrements the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param cost the item type to adjust
     * @param count the amount by which to adjust the provided item
     */
    private static void adjustDown(EventProcessingContext context, ProcurementCost cost, int count)
    {
        UserTransaction transaction = new UserTransaction(((-1) * count), cost);
        context.getTransactions().add(transaction);
    }
}
