package com.controllerface.cmdr_j.classes.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PrioritySystems_1 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_1()
    {
        super(PowerDistributor_PrioritySystems_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, -3d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, -1d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, 20d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, 16d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, -3d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -3d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
