package com.controllerface.cmdr_j.classes.recipes.misc.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_WideAngle_3 extends AbstractModificationRecipe
{
    public Sensor_Misc_WideAngle_3()
    {
        super(Sensor_Misc_WideAngle_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 60d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, 30d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
