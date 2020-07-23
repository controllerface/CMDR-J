package com.controllerface.cmdr_j.classes.recipes.surfacescanner.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_Expanded_4 extends AbstractModificationRecipe
{
    public Sensor_Misc_Expanded_4()
    {
        super(Sensor_Misc_Expanded_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 80d),
                                new ItemEffectData(ItemEffect.DSS_PatchRadius, 40d)
                        ),
                new CostData(Material.PROTOLIGHTALLOYS, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
