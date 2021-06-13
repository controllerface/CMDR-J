package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Manticore_Tormentor_Grade_3 extends AbstractUpgradeRecipe
{
    public Manticore_Tormentor_Grade_3()
    {
        super("Manticore Tormentor - Grade 3",
            ItemGrade.GRADE_3,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 22.1d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 2d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 5),
            new CostData(Material.IONISEDGAS, 5),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 5),
            new CostData(Material.CHEMICALSUPERBASE, 15),
            new CostData(Material.MICROELECTRODE, 15),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}