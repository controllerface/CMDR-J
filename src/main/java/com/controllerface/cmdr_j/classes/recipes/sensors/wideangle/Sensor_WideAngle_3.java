package com.controllerface.cmdr_j.classes.recipes.sensors.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_WideAngle_3 extends AbstractModificationRecipe
{
    public Sensor_WideAngle_3()
    {
        super(Sensor_WideAngle_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 30d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d),
                                new ItemEffectData(ItemEffect.Range, -12d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
