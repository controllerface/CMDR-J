package com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Dominator_Grade_4 extends AbstractUpgradeRecipe
{
    public Dominator_Grade_4()
    {
        super("Dominator Suit - Grade 4",
            ItemGrade.GRADE_4,
            new ItemEffects(
                new ItemEffectData(ItemEffect.Suit_Shield_Regen, 2.02d),
                new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 27.6d),
                new ItemEffectData(ItemEffect.Suit_Mod_Slots, 3d)
            ),
            new CostData(Material.SUITSCHEMATIC, 10),
            new CostData(Material.HEALTHMONITOR, 10),
            new CostData(Material.LARGECAPACITYPOWERREGULATOR, 10),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 10),
            new CostData(Material.TITANIUMPLATING, 25),
            new CostData(Material.GRAPHENE, 25),
            new CostData(CreditCost.CREDIT_COST, 4_500_000));
    }
}