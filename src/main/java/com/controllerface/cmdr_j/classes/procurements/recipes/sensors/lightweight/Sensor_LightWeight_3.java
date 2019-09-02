package com.controllerface.cmdr_j.classes.procurements.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_LightWeight_3 extends AbstractModifcationRecipe
{
    public Sensor_LightWeight_3()
    {
        super(Sensor_LightWeight_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -30d),
                                new ItemEffectData(ItemEffect.Mass, -50d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));
    }
}
