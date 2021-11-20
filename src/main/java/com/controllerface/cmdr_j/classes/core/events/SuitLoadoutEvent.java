package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.classes.data.SuitModuleData;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.PersonalWeapon;
import com.controllerface.cmdr_j.enums.equipment.modules.SpaceSuit;
import com.controllerface.cmdr_j.enums.equipment.suits.SuitGearSlot;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class SuitLoadoutEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var suitName = ((String) event.get("SuitName")).toLowerCase();
        SpaceSuit suit;
        suit = SpaceSuit.findModule(suitName).orElse(null);

        if (suit == null)
        {
            System.out.println("suit is null: " + suitName);
            return;
        }

        gameState.clearSuitModules();

        var data = new SuitModuleData.Builder(suit)
            .setLevel(suit.gearClass)
            .build();

        gameState.setSuitModule(SuitGearSlot.SpaceSuit, data);

        var modules = ((List<Map<String, Object>>) event.get("Modules"));

        modules.forEach(module -> handleModule(gameState, module));
        gameState.emitSuitLoadoutEvent();
    }


    private void handleModule(GameState gameState, Map<String, Object> module)
    {
        try
        {
            // todo: get modifier data for weapon mods

            @SuppressWarnings("unchecked")
            var mods = ((List<String>) module.get("WeaponMods"));
            List<ModifierData> modRecipes = new ArrayList<>();
            mods.forEach(m->
            {
                var recipe = ModificationRecipe.byName(m);
                if (recipe.isPresent())
                {
                    recipe.get().effects().effectStream()
                        .map(e -> new ModifierData(e.effect, e.stringValue))
                        .forEach(modRecipes::add);
                }
                else
                {
                    System.out.println("unknown recipe: " + m);
                }
            });

            var slotName = ((String) module.get("SlotName"));
            var moduleName = ((String) module.get("ModuleName"));
            int moduleClass = ((Number) module.get("Class")).intValue();
            var weaponModule = PersonalWeapon.findModule(moduleName);
            var gearSlot = SuitGearSlot.valueOf(slotName);
            var moduleData = new SuitModuleData.Builder(weaponModule)
                .setModifiers(modRecipes)
                .setLevel(moduleClass)
                .build();
            gameState.setSuitModule(gearSlot, moduleData);
        }
        catch (Exception e)
        {
            System.out.println("Problem!");
            e.printStackTrace();
        }
    }
}
