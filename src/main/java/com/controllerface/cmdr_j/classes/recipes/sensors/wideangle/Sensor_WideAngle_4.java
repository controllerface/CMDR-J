package com.controllerface.cmdr_j.classes.recipes.sensors.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_WideAngle_4 extends AbstractModificationRecipe
{
    public Sensor_WideAngle_4()
    {
        super(Sensor_WideAngle_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 40d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d),
                                new ItemEffectData(ItemEffect.Range, -16d)
                        ),
                new CostData(Material.ENCODEDSCANDATA, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
