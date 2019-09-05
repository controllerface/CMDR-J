package com.controllerface.cmdr_j.classes.recipes.surfacescanner.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_Expanded_5 extends AbstractModificationRecipe
{
    public Sensor_Misc_Expanded_5()
    {
        super(Sensor_Misc_Expanded_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 100d),
                                new ItemEffectData(ItemEffect.DSS_PatchRadius, 50d)
                        ),
                new CostData(Material.PROTORADIOLICALLOYS, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.TIN, 1));
    }
}
