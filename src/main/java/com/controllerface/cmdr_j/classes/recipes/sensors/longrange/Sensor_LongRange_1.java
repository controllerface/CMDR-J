package com.controllerface.cmdr_j.classes.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LongRange_1 extends AbstractModificationRecipe
{
    public Sensor_LongRange_1()
    {
        super(Sensor_LongRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle_Percent, -10d),
                                new ItemEffectData(ItemEffect.Range_Percent, 15d)
                        ),
                new CostData(Material.IRON, 1));
    }
}
