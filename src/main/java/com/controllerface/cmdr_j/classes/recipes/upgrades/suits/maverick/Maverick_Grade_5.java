package com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Maverick_Grade_5 extends AbstractUpgradeRecipe
{
    public Maverick_Grade_5()
    {
        super("Maverick Suit - Grade 5",
            ItemGrade.GRADE_5,
            new ItemEffects(
                new ItemEffectData(ItemEffect.Suit_Shield_Regen, 2.23),
                new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 30.4d),
                new ItemEffectData(ItemEffect.Suit_Mod_Slots, 4d)
            ),
            new CostData(Material.SUITSCHEMATIC, 15),
            new CostData(Material.HEALTHMONITOR, 15),
            new CostData(Material.LARGECAPACITYPOWERREGULATOR, 15),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 15),
            new CostData(Material.CARBONFIBREPLATING, 35),
            new CostData(Material.GRAPHENE, 35),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}