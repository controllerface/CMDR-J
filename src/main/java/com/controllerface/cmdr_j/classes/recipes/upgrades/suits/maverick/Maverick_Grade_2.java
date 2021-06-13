package com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Maverick_Grade_2 extends AbstractUpgradeRecipe
{
    public Maverick_Grade_2()
    {
        super("Maverick Suit - Grade 2",
            ItemGrade.GRADE_2,
            new ItemEffects(
                new ItemEffectData(ItemEffect.Suit_Shield_Regen, 121d),
                new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 16.5d),
                new ItemEffectData(ItemEffect.Suit_Mod_Slots, 1d)
            ),
            new CostData(Material.SUITSCHEMATIC, 1),
            new CostData(Material.HEALTHMONITOR, 1),
            new CostData(Material.LARGECAPACITYPOWERREGULATOR, 1),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 1),
            new CostData(Material.CARBONFIBREPLATING, 5),
            new CostData(Material.GRAPHENE, 5),
            new CostData(CreditCost.CREDIT_COST, 600_000));
    }
}