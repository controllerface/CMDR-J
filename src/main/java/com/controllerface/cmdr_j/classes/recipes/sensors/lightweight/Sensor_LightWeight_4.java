package com.controllerface.cmdr_j.classes.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LightWeight_4 extends AbstractModificationRecipe
{
    public Sensor_LightWeight_4()
    {
        super(Sensor_LightWeight_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -40d),
                                new ItemEffectData(ItemEffect.Mass, -65d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHASEALLOYS, 1),
                new CostData(Material.PROTOLIGHTALLOYS, 1));
    }
}
