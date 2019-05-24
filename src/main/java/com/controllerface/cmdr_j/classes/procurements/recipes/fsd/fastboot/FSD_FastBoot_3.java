package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_FastBoot_3 extends AbstractModifcationRecipe
{
    public FSD_FastBoot_3()
    {
        super(FSD_FastBoot_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, -50d),
                                new ItemEffectData(ItemEffect.Integrity, -9d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 9d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 12d)
                        ),
                new CostData(Material.GRIDRESISTORS, 1),
                new CostData(Material.HEATDISPERSIONPLATE, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
