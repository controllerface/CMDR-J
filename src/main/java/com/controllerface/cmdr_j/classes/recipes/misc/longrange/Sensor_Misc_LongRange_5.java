package com.controllerface.cmdr_j.classes.recipes.misc.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_LongRange_5 extends AbstractModificationRecipe
{
    public Sensor_Misc_LongRange_5()
    {
        super(Sensor_Misc_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.PowerDraw, 50d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, -30d),
                                new ItemEffectData(ItemEffect.Range, 120d)
                        ),
                new CostData(Material.COMPACTEMISSIONSDATA, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
