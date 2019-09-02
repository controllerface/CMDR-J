package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_WideAngle_2 extends AbstractModifcationRecipe
{
    public Sensor_WideAngle_2()
    {
        super(Sensor_WideAngle_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 80d),
                                new ItemEffectData(ItemEffect.Range, -8d)
                        ),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
