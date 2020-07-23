package com.controllerface.cmdr_j.classes.recipes.misc.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_LongRange_3 extends AbstractModificationRecipe
{
    public Sensor_Misc_LongRange_3()
    {
        super(Sensor_Misc_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 30d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d),
                                new ItemEffectData(ItemEffect.Range, 72d)
                        ),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.IRON, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
