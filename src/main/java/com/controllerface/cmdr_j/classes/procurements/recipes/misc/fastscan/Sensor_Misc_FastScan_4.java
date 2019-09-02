package com.controllerface.cmdr_j.classes.procurements.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_FastScan_4 extends AbstractModificationRecipe
{
    public Sensor_Misc_FastScan_4()
    {
        super(Sensor_Misc_FastScan_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -40d),
                                new ItemEffectData(ItemEffect.Range, -20d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, -65d)
                        ),
                new CostData(Material.ENCRYPTIONARCHIVES, 1),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.MANGANESE, 1));
    }
}
