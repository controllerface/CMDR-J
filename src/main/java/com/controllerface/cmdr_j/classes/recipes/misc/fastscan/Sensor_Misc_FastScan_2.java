package com.controllerface.cmdr_j.classes.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Sensor_Misc_FastScan_2 extends AbstractModificationRecipe
{
    public Sensor_Misc_FastScan_2()
    {
        super(Sensor_Misc_FastScan_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -20d),
                                new ItemEffectData(ItemEffect.Range_Percent, -10d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan_Percent, -35d)
                        ),
                new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
