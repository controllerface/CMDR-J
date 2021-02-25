package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.ShipModuleData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class EngineerCraftEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        ((List<Map<String, Object>>) event.get("Ingredients"))
            .forEach(ingredient -> adjustMaterial(gameState, ingredient));

        var applyExperimentalEffect = ((String) event.get("ApplyExperimentalEffect"));
        var moduleKey = ((String) event.get("Module"));
        var slotKey = ((String) event.get("Slot"));

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

        var existingModule = gameState.getShipModule(slot);

        var moduleBuilder = new ShipModuleData.Builder(module)
            .setPowered(existingModule.powered)
            .setPriority(existingModule.priority)
            .setHealth(existingModule.health)
            .setAmmoInClip(existingModule.ammoInClip)
            .setAmmoInHopper(existingModule.ammoInHopper);

        var modificationName = ((String) event.get("BlueprintName"));
        var modificationBlueprint = JournalEventEX.determineModificationBlueprint(modificationName);
        if (modificationBlueprint == null)
        {
            System.err.println("Unknown Modification:" + modificationName);
            modificationBlueprint = ModificationBlueprint.Unknown;
        }

        var experimentalEffectName = ((String) event.get("ExperimentalEffect"));
        var experimentalRecipe = JournalEventEX.determineExperimentalRecipe(experimentalEffectName);
        if (experimentalEffectName != null && experimentalRecipe == null)
        {
            System.err.println("Unknown Experimental Effect:" + experimentalEffectName);
            experimentalRecipe = ExperimentalRecipe.Unknown;
        }

        var level = ((Integer) event.get("Level"));
        var quality = ((Double) event.get("Quality"));

        var modificationRecipe = modificationBlueprint.recipeStream()
            .filter(recipe -> recipe.getGrade().getNumericalValue() == level)
            .findFirst().orElse(null);

        var modifiers = new ArrayList<ModifierData>();
        ((List<Map<String, Object>>) event.get("Modifiers"))
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

        if (applyExperimentalEffect != null)
        {
            gameState.completeTask(module.experimentalType(), experimentalRecipe);
        }
        else
        {
            gameState.completeTask(module.modificationType(), modificationRecipe);
        }

        var shipModule = moduleBuilder.build();
        gameState.setShipModule(slot, shipModule);

        gameState.emitLoadoutEvent();
        gameState.emitCurrentMass();
        gameState.emitPowerStats();
        gameState.emitOffenseStats();
        gameState.emitDefenseStats();
    }

    private void adjustMaterial(GameState gameState, Map<String, Object> ingredient)
    {
        var name = ((String) ingredient.get("Name")).toUpperCase();
        var count = ((Number) ingredient.get("Count")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, -1 * count);
    }
}
