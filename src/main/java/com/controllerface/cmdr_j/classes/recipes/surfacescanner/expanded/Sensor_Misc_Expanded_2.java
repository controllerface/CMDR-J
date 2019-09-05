package com.controllerface.cmdr_j.classes.recipes.surfacescanner.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_Expanded_2 extends AbstractModificationRecipe
{
    public Sensor_Misc_Expanded_2()
    {
        super(Sensor_Misc_Expanded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 40d),
                                new ItemEffectData(ItemEffect.DSS_PatchRadius, 20d)
                        ),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
