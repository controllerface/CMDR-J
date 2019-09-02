package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

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
