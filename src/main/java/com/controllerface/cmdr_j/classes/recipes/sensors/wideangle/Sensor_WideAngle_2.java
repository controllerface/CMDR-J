package com.controllerface.cmdr_j.classes.recipes.sensors.wideangle;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_WideAngle_2 extends AbstractModificationRecipe
{
    public Sensor_WideAngle_2()
    {
        super(Sensor_WideAngle_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 20d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle_Percent, 80d),
                                new ItemEffectData(ItemEffect.Range_Percent, -8d)
                        ),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
