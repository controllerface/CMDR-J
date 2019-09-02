package com.controllerface.cmdr_j.classes.procurements.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_FastScan_1 extends AbstractModifcationRecipe
{
    public Sensor_Misc_FastScan_1()
    {
        super(Sensor_Misc_FastScan_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -10d),
                                new ItemEffectData(ItemEffect.Range, -5d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, -20d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
