package com.controllerface.cmdr_j.classes.recipes.upgrades.suits.artemis;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Artemis_Grade_2 extends AbstractUpgradeRecipe
{
    public Artemis_Grade_2()
    {
        super("Artemis Suit - Grade 2",
            ItemGrade.GRADE_2,
            new ItemEffects(
                new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.07d),
                new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 14.7d),
                new ItemEffectData(ItemEffect.Suit_Mod_Slots, 1d)
            ),
            new CostData(Material.SUITSCHEMATIC, 1),
            new CostData(Material.HEALTHMONITOR, 1),
            new CostData(Material.LARGECAPACITYPOWERREGULATOR, 1),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 1),
            new CostData(Material.AEROGEL, 5),
            new CostData(Material.GRAPHENE, 5),
            new CostData(CreditCost.CREDIT_COST, 600_000));
    }
}