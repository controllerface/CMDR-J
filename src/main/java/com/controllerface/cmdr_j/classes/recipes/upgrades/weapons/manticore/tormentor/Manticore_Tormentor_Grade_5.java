package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Manticore_Tormentor_Grade_5 extends AbstractUpgradeRecipe
{
    public Manticore_Tormentor_Grade_5()
    {
        super("Manticore Tormentor - Grade 5",
            ItemGrade.GRADE_5,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 38.08d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 4d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 15),
            new CostData(Material.IONISEDGAS, 15),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 15),
            new CostData(Material.CHEMICALSUPERBASE, 35),
            new CostData(Material.MICROELECTRODE, 35),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}