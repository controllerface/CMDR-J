package com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Dominator_Grade_3 extends AbstractUpgradeRecipe
{
    public Dominator_Grade_3()
    {
        super("Dominator Suit - Grade 3",
            ItemGrade.GRADE_3,
            new ItemEffects(
                new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.65d),
                new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 22.5d),
                new ItemEffectData(ItemEffect.Suit_Mod_Slots, 2d)
            ),
            new CostData(Material.SUITSCHEMATIC, 5),
            new CostData(Material.HEALTHMONITOR, 5),
            new CostData(Material.LARGECAPACITYPOWERREGULATOR, 5),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 8),
            new CostData(Material.TITANIUMPLATING, 15),
            new CostData(Material.GRAPHENE, 15),
            new CostData(CreditCost.CREDIT_COST, 2_250_000));
    }
}