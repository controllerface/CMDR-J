package com.controllerface.cmdr_j.classes.recipes.sensors.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_LightWeight_2 extends AbstractModificationRecipe
{
    public Sensor_LightWeight_2()
    {
        super(Sensor_LightWeight_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -20d),
                                new ItemEffectData(ItemEffect.Mass, -35d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -10d)
                        ),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));
    }
}
