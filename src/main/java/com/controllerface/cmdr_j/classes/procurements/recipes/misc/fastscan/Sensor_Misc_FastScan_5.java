package com.controllerface.cmdr_j.classes.procurements.recipes.misc.fastscan;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_FastScan_5 extends AbstractModificationRecipe
{
    public Sensor_Misc_FastScan_5()
    {
        super(Sensor_Misc_FastScan_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -50d),
                                new ItemEffectData(ItemEffect.Range, -25d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, -80d)
                        ),
                new CostData(Material.ADAPTIVEENCRYPTORS, 1),
                new CostData(Material.ARSENIC, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
