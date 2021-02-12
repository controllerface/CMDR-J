package com.controllerface.cmdr_j.classes.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_FastBoot_5 extends AbstractModificationRecipe
{
    public FSD_FastBoot_5()
    {
        super(FSD_FastBoot_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, -80d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -15d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 15d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 20d)
                        ),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.TELLURIUM, 1));
    }
}
