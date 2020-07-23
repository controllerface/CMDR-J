package com.controllerface.cmdr_j.classes.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PrioritySystems_2 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_2()
    {
        super(PowerDistributor_PrioritySystems_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -6d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -2d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 30d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 23d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -6d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -6d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
