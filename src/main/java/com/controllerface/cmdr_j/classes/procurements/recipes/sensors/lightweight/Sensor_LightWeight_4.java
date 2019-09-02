package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LightWeight_4 extends AbstractModifcationRecipe
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
