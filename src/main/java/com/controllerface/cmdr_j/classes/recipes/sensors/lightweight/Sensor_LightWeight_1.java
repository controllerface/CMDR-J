package com.controllerface.cmdr_j.classes.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LightWeight_1 extends AbstractModificationRecipe
{
    public Sensor_LightWeight_1()
    {
        super(Sensor_LightWeight_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -10d),
                                new ItemEffectData(ItemEffect.Mass, -20d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -5d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
