package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.fastboot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_FastBoot_5 extends AbstractModifcationRecipe
{
    public FSD_FastBoot_5()
    {
        super(FSD_FastBoot_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, -80d),
                                new ItemEffectData(ItemEffect.Integrity, -15d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 15d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 20d)
                        ),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.TELLURIUM, 1));
    }
}
