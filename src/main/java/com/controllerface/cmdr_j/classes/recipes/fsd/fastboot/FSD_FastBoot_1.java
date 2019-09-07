package com.controllerface.cmdr_j.classes.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_FastBoot_1 extends AbstractModificationRecipe
{
    public FSD_FastBoot_1()
    {
        super(FSD_FastBoot_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, -20d),
                                new ItemEffectData(ItemEffect.Integrity, -3d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 3d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 4d)
                        ),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
