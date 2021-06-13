package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.executioner;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Manticore_Executioner_Grade_4 extends AbstractUpgradeRecipe
{
    public Manticore_Executioner_Grade_4()
    {
        super("Manticore Executioner - Grade 4",
            ItemGrade.GRADE_4,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 27.2d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 3d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 10),
            new CostData(Material.IONISEDGAS, 10),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 10),
            new CostData(Material.CHEMICALSUPERBASE, 25),
            new CostData(Material.MICROELECTRODE, 25),
            new CostData(CreditCost.CREDIT_COST, 5_250_000));
    }
}