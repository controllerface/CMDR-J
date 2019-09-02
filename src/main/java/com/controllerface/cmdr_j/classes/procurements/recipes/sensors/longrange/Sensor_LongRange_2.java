package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LongRange_2 extends AbstractModifcationRecipe
{
    public Sensor_LongRange_2()
    {
        super(Sensor_LongRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 40d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d),
                                new ItemEffectData(ItemEffect.Range, 30d)
                        ),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.IRON, 1));
    }
}
