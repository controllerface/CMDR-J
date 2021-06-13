package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Karma_L_6_Grade_3 extends AbstractUpgradeRecipe
{
    public Karma_L_6_Grade_3()
    {
        super("Karma L-6 - Grade 3",
            ItemGrade.GRADE_3,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 52.4d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 2d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 5),
            new CostData(Material.COMPRESSIONLIQUEFIEDGAS, 5),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 5),
            new CostData(Material.TUNGSTENCARBIDE, 15),
            new CostData(Material.WEAPONCOMPONENT, 15),
            new CostData(CreditCost.CREDIT_COST, 1_125_000));
    }
}