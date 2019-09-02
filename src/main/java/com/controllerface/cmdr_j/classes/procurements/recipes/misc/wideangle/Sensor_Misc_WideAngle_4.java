package com.controllerface.cmdr_j.classes.procurements.recipes.misc.wideangle;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Sensor_Misc_WideAngle_4 extends AbstractModifcationRecipe
{
    public Sensor_Misc_WideAngle_4()
    {
        super(Sensor_Misc_WideAngle_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Mass, 80d),
                                new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d),
                                new ItemEffectData(ItemEffect.ScannerTimeToScan, 40d)
                        ),
                new CostData(Material.ENCODEDSCANDATA, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
