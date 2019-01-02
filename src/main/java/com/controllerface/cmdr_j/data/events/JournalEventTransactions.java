package com.controllerface.cmdr_j.data.events;

import com.controllerface.cmdr_j.*;
import com.controllerface.cmdr_j.data.MaterialTradeRecipe;
import com.controllerface.cmdr_j.data.ModifierData;
import com.controllerface.cmdr_j.data.ShipModuleData;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.commander.PlayerStat;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.modules.*;
import com.controllerface.cmdr_j.structures.equipment.ships.*;
import com.controllerface.cmdr_j.structures.journal.JournalEvent;
import com.controllerface.cmdr_j.threads.UserTransaction;
import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

import static com.controllerface.cmdr_j.threads.UserTransaction.*;

/**
 * Contains functionality required for {@linkplain JournalEvent} implementations. Enumerated events use these static
 * methods to mutate the user's tracked information (ex: material inventory quantities, tracked tasks, etc.). These
 * changes to the UI are generally done asynchronously via a transaction queue.
 *
 * Created by Stephen on 7/17/2018.
 */
public class JournalEventTransactions
{

    /**
     * Internal enum, used to make the adjustment methods easier for both material and commodity adjustments
     */
    public enum AdjustmentType
    {
        COMMODITY,
        MATERIAL
    }


    /*
    Logging
     */

    private static void logMessage(EventProcessingContext context, MessageType messageType, String message)
    {
        context.getTransactions().add(new UserTransaction(messageType, message));
    }

    public static void logGeneralMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.GENERAL, message);
    }

    public static void logInventoryMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.INVENTORY, message);
    }

    public static void logLoadoutMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.LOADOUT, message);
    }

    public static void logEngineeringMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.ENGINEERING, message);
    }

    public static void logTravelMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.TRAVEL, message);
    }

    public static void logExplorationMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.EXPLORATION, message);
    }

    public static void logCombatMessage(EventProcessingContext context, String message)
    {
        logMessage(context, MessageType.COMBAT, message);
    }


    /*
    Instantiation Methods
     */

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

    private static ShipModule determineModuleType(String moduleName)
    {
        ShipModule module;

        try { module = HardpointModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = CoreInternalModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = OptionalInternalModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = OptionalInternalShieldModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = Cosmetic.findCosmetic(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        return null;
    }

    private static ModificationBlueprint determineModificationBlueprint(String modname)
    {
        try { return ModificationBlueprint.valueOf(modname); }
        catch (Exception e) { return null; }
    }

    private static ExperimentalRecipe determineExperimentalRecipe(String expname)
    {
        try { return ExperimentalRecipe.valueOf(expname); }
        catch (Exception e) { return null; }
    }


    /*
    Data Extraction Methods
     */

    public static String extractStatString(EventProcessingContext context, Statistic stat)
    {
        return stat.format(context.getRawData().get(stat.getKey()));
    }

    public static double extractStatDouble(EventProcessingContext context, Statistic stat)
    {
        return Double.parseDouble(extractStatString(context, stat));
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
    public static Pair<String, Integer> extractPair(Map<String, Object> data, String keyName, String valueName)
    {
        return new Pair<>(data.get(keyName).toString().toUpperCase(), Integer.parseInt(data.get(valueName).toString()));
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


    /*
    Tracked Task List Adjustments
     */

    private static void adjustBlueprintDown(EventProcessingContext context,
                                            ProcurementType procurementType,
                                            ProcurementRecipe procurementRecipe,
                                            int amount)
    {
        Pair<ProcurementType, ProcurementRecipe> bluePrint = new Pair<>(procurementType, procurementRecipe);
        UserTransaction transaction = new UserTransaction((-1 * amount), bluePrint);
        context.getTransactions().add(transaction);
    }


    /*
    Statistic Adjustments
     */

    /**
     * Sets a Statistic value on a context specific CommanderData object using a context specific raw JSON object
     * to extract the stat value
     *
     * @param context the current event processing context
     * @param stat the statistic type to set the value of
     */
    public static void setStatFromData(EventProcessingContext context, Statistic stat)
    {
        String value = extractStatString(context, stat);
        context.getCommanderData().setStat(stat, value);
        if (stat != PlayerStat.Ship && stat != CoreInternalSlot.Ship)
        {
            logGeneralMessage(context, stat.getText() + " = " + value);
        }
    }


    /*
    Inventory Item Adjustments
     */

    /**
     * Increments the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param cost the item type to adjust
     * @param count the amount by which to adjust the provided item
     */
    public static void adjust(EventProcessingContext context, ProcurementCost cost, int count)
    {
        UserTransaction transaction = new UserTransaction(count, cost);
        context.getTransactions().add(transaction);

        boolean gain = count > 0;
        String message = ((gain) ? ("+" + count) : + count) + " " + cost.getLocalizedName();
        logInventoryMessage(context, message);
    }

    /**
     * Decrements the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param cost the item type to adjust
     * @param count the amount by which to adjust the provided item
     */
    public static void adjustDown(EventProcessingContext context, ProcurementCost cost, int count)
    {
        adjust(context, cost, -1 * count);
    }

    /**
     * Increments the count of an inventory item in a context specific CommanderData object
     *
     * @param context the current event processing context
     * @param pair a Pair<String, Integer> object describing the item type and amount to adjust
     * @param adjustmentType either COMMODITY or MATERIAL based on the type of item to adjust
     */
    public static void adjust(EventProcessingContext context, Pair<String, Integer> pair, AdjustmentType adjustmentType)
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
    public static void adjustDown(EventProcessingContext context, Pair<String, Integer> pair, AdjustmentType adjustmentType)
    {
        adjust(context, new Pair<>(pair.getKey(), -1 * pair.getValue()), adjustmentType);
    }

    /**
     * Increments the count of a commodity in a context specific CommanderData object
     *
     * [Type, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    public static void adjustCommodityType(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustCommodityTypeDown(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustCommodityCount(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustCommodityCountDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractNameCountPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Decrements the count of a commodity in a context specific CommanderData object
     *
     * [Material, Quantity] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the commodity type and value
     */
    public static void adjustCommodityQuantityDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractCommodityQuantityPair(data), AdjustmentType.COMMODITY);
    }

    /**
     * Increments the count of a material in a context specific CommanderData object
     *
     * [Name, Count] variant
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the material type and value
     */
    public static void adjustMaterialCount(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustMaterialCountDown(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustMaterialQuantity(EventProcessingContext context, Map<String, Object> data)
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
    public static void adjustMaterialQuantityDown(EventProcessingContext context, Map<String, Object> data)
    {
        adjustDown(context, extractMaterialQuantityPair(data), AdjustmentType.MATERIAL);
    }


    /*
    Ship Slot Adjustments
     */

    public static void emptySlotFromData(EventProcessingContext context)
    {
        String slotKey = ((String) context.getRawData().get("Slot"));
        Statistic slot = determineStatType(slotKey);
        setSlotFromData(context, slot, EmptyModule.EMPTY_MODULE, null);
    }

    /**
     * Marked {@code @SuppressWarnings("unchecked")} for multiple points where data is cast from JSON objects. The
     * logic contained uses the documented structure of the object in the Journal API to extract.
     */
    @SuppressWarnings("unchecked")
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

        StringBuilder messageBuffer = new StringBuilder();
        messageBuffer.append(slot.getText())
                .append(" :: ").append(module.displayText());

        List<ModifierData> modifiers = new ArrayList<>();

        if (engineering != null)
        {
            modificationName = ((String) engineering.get("BlueprintName"));
            experimentalEffectName = ((String) engineering.get("ExperimentalEffect"));
            modificationBlueprint = determineModificationBlueprint(modificationName);
            experimentalRecipe = determineExperimentalRecipe(experimentalEffectName);

            level = ((Integer) engineering.get("Level"));
            quality = ((Double) engineering.get("Quality"));

            if (modificationBlueprint != null) messageBuffer.append(" :: ")
                    .append(" G").append(level).append(" ")
                    .append(modificationBlueprint);

            if (experimentalRecipe != null) messageBuffer.append(" :: ").append(experimentalRecipe.getDisplayLabel());

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
                .setUserTransactions(context.getTransactions())
                .build();

        context.getCommanderData().setShipModule(shipModuleData);
        logLoadoutMessage(context, messageBuffer.toString());
    }

    /**
     * Sets a ship internal slot specific Statistic value on a context specific CommanderData object using a context
     * specific raw JSON object to extract the slot name and value
     *
     * @param context the current event processing context
     * @param data the raw JSON object from which to extract the slot name and value
     */
    public static void setSlotFromLoadout(EventProcessingContext context, Map<String, Object> data)
    {
        String slotKey = ((String) data.get("Slot"));
        String moduleKey = ((String) data.get("Item"));

        Statistic slot = determineStatType(slotKey);
        ShipModule module = determineModuleType(moduleKey);

        @SuppressWarnings("unchecked") // uses documented structure
        Map<String, Object> engineering = ((Map<String, Object>) data.get("Engineering"));

        if (slot == null || module == null)
        {
            if (slot == null) System.err.println("Ignoring Slot: " + slotKey);
            if (module == null) System.err.println("Ignoring Module: " + moduleKey);
            return;
        }

        setSlotFromData(context, slot, module, engineering);
    }

    public static void processBuyModule(EventProcessingContext context)
    {
        Map<String, Object> data =  context.getRawData();
        String slotKey = ((String) data.get("Slot"));
        String moduleKey = ((String) data.get("BuyItem"))
                .replace("$","")
                .replace("_name;","");

        Statistic slot = determineStatType(slotKey);
        ShipModule module = determineModuleType(moduleKey);

        if (module != null) logLoadoutMessage(context, "Purchased Module: " + module.displayText());

        ShipModuleData shipModuleData = new ShipModuleData.Builder()
                .setModuleName(slot)
                .setModule(module)
                .setUserTransactions(context.getTransactions())
                .build();

        context.getCommanderData().setShipModule(shipModuleData);
    }

    public static void processRetrieveModule(EventProcessingContext context)
    {
        ShipModuleData.Builder dataBuilder = new ShipModuleData.Builder();
        dataBuilder.setUserTransactions(context.getTransactions());

        Map<String, Object> data =  context.getRawData();
        String slotKey = ((String) data.get("Slot"));
        String moduleKey = ((String) data.get("RetrievedItem"))
                .replace("$","")
                .replace("_name;","");

        Statistic slot = determineStatType(slotKey);
        ShipModule module = determineModuleType(moduleKey);

        if (module != null) logLoadoutMessage(context, "Retrieved Module: " + module.displayText());

        dataBuilder
                .setModule(module)
                .setModuleName(slot);

        if (data.containsKey("EngineerModifications"))
        {
            String modificationName = ((String) data.get("EngineerModifications"));
            ModificationBlueprint modificationBlueprint = JournalEventTransactions.determineModificationBlueprint(modificationName);
            Integer level = ((Integer) data.get("Level"));

            dataBuilder.setModificationBlueprint(modificationBlueprint);
            dataBuilder.setLevel(level);
        }

        context.getCommanderData().setShipModule(dataBuilder.build());
    }

//    @SuppressWarnings("unchecked") // uses documented JSON object structure
//    static void processLoadout(EventProcessingContext context)
//    {
//        JournalSyncTask.shipStats.forEach(context.getCommanderData()::removeStat);
//
//        setStatFromData(context, CoreInternalSlot.Ship);
//        setStatFromData(context, CoreInternalSlot.ShipName);
//        setStatFromData(context, CoreInternalSlot.ShipIdent);
//
//        String shipName = context.getCommanderData().getStat(CoreInternalSlot.Ship);
//        Ship ship;
//        try
//        {
//            ship = Ship.findShip(shipName);
//            logLoadoutMessage(context, "Ship Type: " + ship.getBaseShipStats().getDisplayName());
//            context.getCommanderData().setShip(ship);
//            context.getCommanderData().getStarShip()
//                    .setGivenName(extractStatString(context, CoreInternalSlot.ShipName));
//            context.getCommanderData().getStarShip()
//                    .setShipID(extractStatString(context, CoreInternalSlot.ShipIdent));
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        ((List<Map<String, Object>>) context.getRawData().get("Modules")).stream()
//                .forEach(module -> setSlotFromLoadout(context, module));
//    }

    public static void processMarket(EventProcessingContext context)
    {
        String market = context.getRawData().get("StationName") + " in " + context.getRawData().get("StarSystem");
        context.getTransactions().add(new UserTransaction(market, context.getRawData()));

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
    }

    public static void processArrival(EventProcessingContext context, String arrivalBody)
    {
        context.getTransactions().add(new UserTransaction(arrivalBody));
    }

    @SuppressWarnings("unchecked")
    public static void processMaterialTrade(EventProcessingContext context)
    {
        Map<String, Object> paid = ((Map<String, Object>) context.getRawData().get("Paid"));
        Map<String, Object> received = ((Map<String, Object>) context.getRawData().get("Received"));

        Material priceMaterial = Material.valueOf(((String) paid.get("Material")).toUpperCase());
        Material yieldMaterial = Material.valueOf(((String) received.get("Material")).toUpperCase());

// TODO: test this version and switch to it if it works.
//        yieldMaterial.getTradeBlueprint()
//                .map(blueprint -> blueprint.recipeStream()
//                        .filter(recipe -> recipe.costStream()
//                                .filter(price -> price.getQuantity() > 0)
//                                .filter(price -> price.getCost().equals(priceMaterial))
//                                .findAny().isPresent())
//                        .findFirst().orElse(null))
//                .ifPresent(recipe -> MaterialTradeType.findMatchingTradeType(priceMaterial)
//                        .ifPresent(tradeType -> recipe.costStream().map(CostData::getQuantity)
//                                .filter(quantity -> quantity > 0)
//                                .findFirst()
//                                .ifPresent(unitCost ->
//                                {
//                                    int count = ((int) paid.get("Quantity")) / unitCost;
//                                    adjustBlueprintDown(context, tradeType, recipe, count);
//                                })));

        ProcurementRecipe recipe = yieldMaterial.getTradeBlueprint()
                .map(b -> b.recipeStream()
                        .filter(r -> r.costStream()
                                .filter(c -> c.getQuantity() > 0)
                                .filter(c-> c.getCost().equals(priceMaterial))
                                .findFirst().orElse(null) != null)
                        .filter(Objects::nonNull)
                        .findFirst()
                        .orElse(null))
                .orElse(null);

        if (recipe == null) return;

        ProcurementType tradeType = MaterialTradeType
                .findMatchingTradeType(priceMaterial)
                .orElse(null);

        int unitCost = recipe.costStream().map(CostData::getQuantity)
                .filter(quantity -> quantity > 0)
                .findFirst().orElse(0);

        int cost = ((int) paid.get("Quantity"));
        int count = cost / unitCost;

        adjustBlueprintDown(context, tradeType, recipe, count);
    }

    @SuppressWarnings("unchecked") // uses documented JSON object structure
    public static void processEngineerUpgrade(EventProcessingContext context)
    {
        Map<String, Object> data = context.getRawData();
        // remove the materials used in the crafting process
        ((List<Map<String, Object>>) data.get("Ingredients"))
                .forEach(ingredient -> adjustMaterialCountDown(context, ingredient));

        String modificationEffect = ((String) data.get("BlueprintName"));
        String experimentalEffect = ((String) data.get("ApplyExperimentalEffect"));
        String moduleName = ((String) data.get("Module"));

        ShipModule module = determineModuleType(moduleName);
        if (module == null)
        {
            System.err.println("Ignoring Module: " + moduleName);
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
            logEngineeringMessage(context, "Applied Experimental Effect: " + experimentalRecipe.getDisplayLabel());
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

            int grade = ((int) data.get("Level"));

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

            logEngineeringMessage(context, "Applied Modification: " + modificationType + " :: " + modificationRecipe.getDisplayLabel());
            adjustBlueprintDown(context, modificationType, modificationRecipe, 1);
        }

        String slotKey = ((String) data.get("Slot"));
        Statistic slot = determineStatType(slotKey);
        if (slot == null)
        {
            System.err.println("Ignoring Slot: " + slotKey);
            return;
        }
        context.getCommanderData().setStat(slot, moduleName);
        setSlotFromData(context, slot, module, data);
    }
}
