package com.controllerface.cmdr_j.classes.recipes.sensors.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_WideAngle_5 extends AbstractModificationRecipe
{
    public Sensor_WideAngle_5()
    {
        super(Sensor_WideAngle_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 50d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d),
                                new ItemEffectData(ItemEffect.Range, -20d)
                        ),
                new CostData(Material.CLASSIFIEDSCANDATA, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.TIN, 1));
    }
}
