package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_FastBoot_2 extends AbstractModifcationRecipe
{
    public FSD_FastBoot_2()
    {
        super(FSD_FastBoot_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, -35d),
                                new ItemEffectData(ItemEffect.Integrity, -6d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 6d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 8d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}