package com.controllerface.cmdr_j.classes.procurements.recipes.misc.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_WideAngle_1 extends AbstractModifcationRecipe
{
    public Sensor_Misc_WideAngle_1()
    {
        super(Sensor_Misc_WideAngle_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 40d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
