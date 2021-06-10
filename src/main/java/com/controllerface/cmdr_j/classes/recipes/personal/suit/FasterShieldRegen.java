package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FasterShieldRegen extends AbstractModificationRecipe
{
    public FasterShieldRegen()
    {
        super(FasterShieldRegen.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    // todo: add actual effects
                    new ItemEffectData(ItemEffect.Shield_Health_Regen, 33d)
                ),
            new CostData(Material.REACTOROUTPUTREVIEW, 10),
            new CostData(Material.IONBATTERY, 5),
            new CostData(Material.MICROTRANSFORMER, 15),
            new CostData(Material.ELECTRICALWIRING, 15),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
