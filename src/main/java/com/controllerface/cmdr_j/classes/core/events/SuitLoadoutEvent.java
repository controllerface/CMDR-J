package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.classes.data.SuitModuleData;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.PersonalWeapon;
import com.controllerface.cmdr_j.enums.equipment.modules.SpaceSuit;
import com.controllerface.cmdr_j.enums.equipment.suits.SuitGearSlot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class SuitLoadoutEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> suitData)
    {
        var suitName = ((String) suitData.get("SuitName")).toLowerCase();
        SpaceSuit suit;
        suit = SpaceSuit.findModule(suitName).orElse(null);

        if (suit == null)
        {
            System.out.println("suit is null: " + suitName);
            return;
        }

        var modRecipes = handleSuitModifications(suitData);

        gameState.clearSuitModules();

        var data = new SuitModuleData.Builder(suit)
            .setLevel(suit.gearClass)
            .setModifiers(modRecipes)
            .build();

        gameState.setSuitModule(SuitGearSlot.SpaceSuit, data);

        var modules = ((List<Map<String, Object>>) suitData.get("Modules"));

        modules.forEach(module -> handleWeaponModule(gameState, module));
        gameState.emitSuitLoadoutEvent();
    }

    @SuppressWarnings("unchecked")
    private List<ModifierData> handleSuitModifications(Map<String, Object> suitData)
    {
        var mods = ((List<String>) suitData.get("SuitMods"));
        List<ModifierData> modRecipes = new ArrayList<>();
        mods.forEach(modName ->
        {
            var recipe = ModificationRecipe.byName(modName);
            if (recipe.isPresent())
            {
                recipe.get().effects().effectStream()
                    .map(e -> new ModifierData(e.effect, e.stringValue))
                    .forEach(modRecipes::add);
            }
            else
            {
                System.out.println("unknown recipe: " + modName);
            }
        });
        return modRecipes;
    }

    private void handleWeaponModule(GameState gameState, Map<String, Object> module)
    {
        try
        {
            // todo: get modifier data for weapon mods

            @SuppressWarnings("unchecked")
            var mods = ((List<String>) module.get("WeaponMods"));
            List<ModifierData> modRecipes = new ArrayList<>();
            mods.forEach(modName->
            {
                var recipe = ModificationRecipe.byName(modName);

                var modifcationName = modName;
                if ("weapon_range".equals(modName))
                {
                    var weaponName = ((String) module.get("ModuleName"));
                    var weapon = PersonalWeapon.findModule(weaponName);
                    if (weapon == null)
                    {
                        System.out.println("unknown weapon: " + weaponName);
                    }
                    else
                    {
                        if (weapon == PersonalWeapon.wpn_s_pistol_laser_sauto
                            || weapon == PersonalWeapon.wpn_m_assaultrifle_laser_fauto
                            || weapon == PersonalWeapon.wpn_m_submachinegun_laser_fauto)
                        {
                            recipe = Optional.of(ModificationRecipe.Greater_Range_Takada);
                        }
                        else if (weapon == PersonalWeapon.wpn_m_sniper_plasma_charged
                            || weapon == PersonalWeapon.wpn_s_pistol_plasma_charged
                            || weapon == PersonalWeapon.wpn_m_shotgun_plasma_doublebarrel
                            || weapon == PersonalWeapon.wpn_m_assaultrifle_plasma_fauto)
                        {
                            recipe = Optional.of(ModificationRecipe.Greater_Range_Manticore);
                        }
                        else if (weapon == PersonalWeapon.wpn_m_assaultrifle_kinetic_fauto
                            || weapon == PersonalWeapon.wpn_s_pistol_kinetic_sauto
                            || weapon == PersonalWeapon.wpn_m_submachinegun_kinetic_fauto
                            || weapon == PersonalWeapon.wpn_m_launcher_rocket_sauto)
                        {
                            recipe = Optional.of(ModificationRecipe.Greater_Range_Kinematic);
                        }
                    }
                }

                if (recipe.isPresent())
                {
                    recipe.get().effects().effectStream()
                        .map(e -> new ModifierData(e.effect, e.stringValue))
                        .forEach(modRecipes::add);
                }
                else
                {
                    System.out.println("unknown recipe: " + modName);
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
