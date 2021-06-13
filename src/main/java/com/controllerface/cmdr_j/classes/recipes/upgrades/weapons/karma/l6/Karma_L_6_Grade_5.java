package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Karma_L_6_Grade_5 extends AbstractUpgradeRecipe
{
    public Karma_L_6_Grade_5()
    {
        super("Karma L-6 - Grade 5",
            ItemGrade.GRADE_5,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 119.2d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 4d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 15),
            new CostData(Material.COMPRESSIONLIQUEFIEDGAS, 15),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 15),
            new CostData(Material.TUNGSTENCARBIDE, 35),
            new CostData(Material.WEAPONCOMPONENT, 35),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}