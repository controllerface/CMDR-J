package com.controllerface.cmdr_j.classes.procurements.recipes.heatsink.capacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HeatSinkLauncher_HeatSinkCapacity_1 extends AbstractModifcationRecipe
{
    public HeatSinkLauncher_HeatSinkCapacity_1()
    {
        super(HeatSinkLauncher_HeatSinkCapacity_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum, 50d),
                                new ItemEffectData(ItemEffect.Mass, 100d),
                                new ItemEffectData(ItemEffect.ReloadTime, 50d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
