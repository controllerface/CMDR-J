package com.controllerface.cmdr_j.classes.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LightWeight_5 extends AbstractModificationRecipe
{
    public Sensor_LightWeight_5()
    {
        super(Sensor_LightWeight_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -50d),
                                new ItemEffectData(ItemEffect.Mass, -80d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.PROTOLIGHTALLOYS, 1),
                new CostData(Material.PROTORADIOLICALLOYS, 1));
    }
}
