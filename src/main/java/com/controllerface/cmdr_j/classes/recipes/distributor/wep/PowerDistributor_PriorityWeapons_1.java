package com.controllerface.cmdr_j.classes.recipes.distributor.wep;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityWeapons_1 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityWeapons_1()
    {
        super(PowerDistributor_PriorityWeapons_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -3d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -1d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 20d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 16d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
