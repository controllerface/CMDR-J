package com.controllerface.cmdr_j.classes.recipes.misc.wideangle;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_WideAngle_5 extends AbstractModificationRecipe
{
    public Sensor_Misc_WideAngle_5()
    {
        super(Sensor_Misc_WideAngle_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass_Percent, 100d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle_Percent, 200d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan_Percent, 50d)
                        ),
                new CostData(Material.CLASSIFIEDSCANDATA, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.TIN, 1));
    }
}
