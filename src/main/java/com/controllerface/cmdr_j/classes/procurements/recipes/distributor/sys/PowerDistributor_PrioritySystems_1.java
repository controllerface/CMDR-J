package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PrioritySystems_1 extends AbstractModifcationRecipe
{
    public PowerDistributor_PrioritySystems_1()
    {
        super(PowerDistributor_PrioritySystems_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -1d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 20d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 16d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -3d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}