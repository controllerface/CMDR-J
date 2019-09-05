package com.controllerface.cmdr_j.classes.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_FastScan_2 extends AbstractModificationRecipe
{
    public Sensor_Misc_FastScan_2()
    {
        super(Sensor_Misc_FastScan_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -20d),
                                new ItemEffectData(ItemEffect.Range, -10d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, -35d)
                        ),
                new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
