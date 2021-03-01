package com.controllerface.cmdr_j.classes.recipes.surfacescanner.expanded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_Expanded_1 extends AbstractModificationRecipe
{
    public Sensor_Misc_Expanded_1()
    {
        super(Sensor_Misc_Expanded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DSS_PatchRadius, 10d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
