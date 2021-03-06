package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.intimidator;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Manticore_Intimidator_Grade_2 extends AbstractUpgradeRecipe
{
    public Manticore_Intimidator_Grade_2()
    {
        super("Manticore Intimidator - Grade 2",
            ItemGrade.GRADE_2,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 21.9d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 1d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 1),
            new CostData(Material.IONISEDGAS, 1),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 1),
            new CostData(Material.CHEMICALSUPERBASE, 5),
            new CostData(Material.MICROELECTRODE, 5),
            new CostData(CreditCost.CREDIT_COST, 600_000));
    }
}