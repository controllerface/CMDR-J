package com.controllerface.cmdr_j.classes.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
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
                                new ItemEffectData(ItemEffect.BootTime, -65d),
                                new ItemEffectData(ItemEffect.Integrity, -12d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 16d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1));
    }
}
