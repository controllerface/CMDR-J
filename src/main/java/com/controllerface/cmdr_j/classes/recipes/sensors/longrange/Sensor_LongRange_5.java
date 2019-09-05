package com.controllerface.cmdr_j.classes.recipes.sensors.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LongRange_5 extends AbstractModificationRecipe
{
    public Sensor_LongRange_5()
    {
        super(Sensor_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 100d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -30d),
                                new ItemEffectData(ItemEffect.Range, 75d)
                        ),
                new CostData(Material.COMPACTEMISSIONSDATA, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
