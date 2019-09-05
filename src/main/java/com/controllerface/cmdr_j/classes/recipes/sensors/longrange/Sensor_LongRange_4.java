package com.controllerface.cmdr_j.classes.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LongRange_4 extends AbstractModificationRecipe
{
    public Sensor_LongRange_4()
    {
        super(Sensor_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 80d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d),
                                new ItemEffectData(ItemEffect.Range, 60d)
                        ),
                new CostData(Material.DECODEDEMISSIONDATA, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.GERMANIUM, 1));
    }
}
