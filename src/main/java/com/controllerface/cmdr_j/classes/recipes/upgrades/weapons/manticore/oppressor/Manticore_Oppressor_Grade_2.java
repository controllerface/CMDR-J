package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.oppressor;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Manticore_Oppressor_Grade_2 extends AbstractUpgradeRecipe
{
    public Manticore_Oppressor_Grade_2()
    {
        super("Manticore Oppressor - Grade 2",
            ItemGrade.GRADE_2,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 6.7d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 1d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 1),
            new CostData(Material.IONISEDGAS, 1),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 1),
            new CostData(Material.CHEMICALSUPERBASE, 5),
            new CostData(Material.MICROELECTRODE, 5),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}