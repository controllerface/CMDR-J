package com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighFrequency_2 extends AbstractModificationRecipe
{
    public PowerDistributor_HighFrequency_2()
    {
        super(PowerDistributor_HighFrequency_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -2d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 18d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -2d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 18d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -2d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 18d)
                        ),
                new CostData(Material.CHEMICALPROCESSORS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
