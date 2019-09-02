package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LongRange_3 extends AbstractModificationRecipe
{
    public Sensor_LongRange_3()
    {
        super(Sensor_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 60d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d),
                                new ItemEffectData(ItemEffect.Range, 45d)
                        ),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.IRON, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
