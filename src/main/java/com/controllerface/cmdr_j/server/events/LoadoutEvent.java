package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.ShipModuleData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class LoadoutEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship_Ident);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship_Name);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Rebuy);
        JournalEventEX.setShipStat(gameState, event, ShipStat.UnladenMass);
        JournalEventEX.setShipStat(gameState, event, ShipStat.MaxJumpRange);
        JournalEventEX.setShipStat(gameState, event, ShipStat.CargoCapacity);

        Map<String, Object> fuelData = ((Map<String, Object>) event.get("FuelCapacity"));

        var reserve = ((Number) fuelData.get("Reserve")).doubleValue();
        var main = ((Number) fuelData.get("Main")).doubleValue();
        gameState.setShipStat(ShipStat.ReserveCapacity, String.valueOf(reserve));
        gameState.setShipStat(ShipStat.Fuel_Capacity, String.valueOf(main));


        if (event.get("HullValue") != null)
        {
            JournalEventEX.setShipStat(gameState, event, ShipStat.HullValue);
        }

        if (event.get("ModulesValue") != null)
        {
            JournalEventEX.setShipStat(gameState, event, ShipStat.ModulesValue);
        }

        gameState.clearShipModules();

        ((List<Map<String, Object>>) event.get("Modules"))
            .forEach(moduleData -> setModule(gameState, moduleData));

        gameState.emitLoadoutEvent();
        gameState.emitCurrentMass();
        gameState.emitPowerStats();
        gameState.emitOffenseStats();
        gameState.emitDefenseStats();
    }

    @SuppressWarnings("unchecked")
    private void setModule(GameState gameState, Map<String, Object> moduleData)
    {
        var slotKey = ((String) moduleData.get("Slot"));
        var moduleKey = ((String) moduleData.get("Item"));
        var powered = ((Boolean) moduleData.get("On"));
        var priority = ((Integer) moduleData.get("Priority"));
        var health = ((Double) moduleData.get("Health"));
        var ammoInClip = ((Integer) moduleData.get("AmmoInClip"));
        var ammoInHopper = ((Integer) moduleData.get("AmmoInHopper"));

        var slot = JournalEventEX.determineStatType(slotKey);
        var module = JournalEventEX.determineModuleType(moduleKey);

        if (slot instanceof CosmeticSlot)
        {
            //System.out.println("Ignoring Cosmetic Slot: " + slot);
            return;
        }

        if (slot == null || module == null)
        {
            if (slot == null) System.err.println("Ignoring Slot: " + slotKey);
            if (module == null) System.err.println("Ignoring Module: " + moduleKey);
            return;
        }

        var moduleBuilder = new ShipModuleData.Builder(module)
            .setPowered(powered)
            .setPriority(priority)
            .setHealth(health)
            .setAmmoInClip(ammoInClip)
            .setAmmoInHopper(ammoInHopper);

        var engineering = ((Map<String, Object>) moduleData.get("Engineering"));

        if (engineering != null)
        {
            var modificationName = ((String) engineering.get("BlueprintName"));
            var modificationBlueprint = JournalEventEX.determineModificationBlueprint(modificationName);
            if (modificationName != null && modificationBlueprint == null)
            {
                System.err.println("Unknown Modification:" + modificationName);
                modificationBlueprint = ModificationBlueprint.Unknown;
            }

            var experimentalEffectName = ((String) engineering.get("ExperimentalEffect"));
            var experimentalRecipe = JournalEventEX.determineExperimentalRecipe(experimentalEffectName);
            if (experimentalEffectName != null && experimentalRecipe == null)
            {
                System.err.println("Unknown Experimental Effect:" + experimentalEffectName);
                experimentalRecipe = ExperimentalRecipe.Unknown;
            }

            var level = ((Integer) engineering.get("Level"));
            var quality = ((Double) engineering.get("Quality"));

            var modifiers = new ArrayList<ModifierData>();
            ((List<Map<String, Object>>) engineering.get("Modifiers"))
                .forEach(modifier ->
                {
                    if (modifier.get("ValueStr") != null)
                    {
                        //System.out.println("Skipping string modifier: " + modifier.get("ValueStr"));
                        return;
                    }
                    ItemEffect effect = ItemEffect.valueOf(((String) modifier.get("Label")));
                    double value = ((Double) modifier.get("Value"));
                    double originalValue = ((Double) modifier.get("OriginalValue"));
                    boolean lessIsGood = ((Integer) modifier.get("LessIsGood")) == 1;
                    modifiers.add(new ModifierData(effect, value, originalValue, lessIsGood));
                });

            moduleBuilder.setModifiers(modifiers)
                .setModificationBlueprint(modificationBlueprint)
                .setExperimentalEffectRecipe(experimentalRecipe)
                .setLevel(level)
                .setQuality(quality);
        }

        var shipModule = moduleBuilder.build();
        gameState.setShipModule(slot, shipModule);
    }
}
