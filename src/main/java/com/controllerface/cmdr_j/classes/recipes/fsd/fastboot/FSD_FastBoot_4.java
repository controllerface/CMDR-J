package com.controllerface.cmdr_j.classes.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_FastBoot_4 extends AbstractModificationRecipe
{
    public FSD_FastBoot_4()
    {
        super(FSD_FastBoot_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, -65d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -12d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 16d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1));
    }
}
