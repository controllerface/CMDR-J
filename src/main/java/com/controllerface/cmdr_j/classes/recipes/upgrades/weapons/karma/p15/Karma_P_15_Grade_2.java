package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.p15;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Karma_P_15_Grade_2 extends AbstractUpgradeRecipe
{
    public Karma_P_15_Grade_2()
    {
        super("Karma P-15 - Grade 2",
            ItemGrade.GRADE_2,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 17.8d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 1d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 1),
            new CostData(Material.COMPRESSIONLIQUEFIEDGAS, 1),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 1),
            new CostData(Material.TUNGSTENCARBIDE, 5),
            new CostData(Material.WEAPONCOMPONENT, 5),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}