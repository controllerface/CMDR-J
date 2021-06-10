package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ReducedToolBatteryConsumption extends AbstractModificationRecipe
{
    public ReducedToolBatteryConsumption()
    {
        super(ReducedToolBatteryConsumption.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Battery_Efficiency, 100d)
                ),
            new CostData(Material.REACTOROUTPUTREVIEW, 10),
            new CostData(Material.ELECTRICALFUSE, 5),
            new CostData(Material.MICROTRANSFORMER, 10),
            new CostData(Material.ELECTRICALWIRING, 15),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
