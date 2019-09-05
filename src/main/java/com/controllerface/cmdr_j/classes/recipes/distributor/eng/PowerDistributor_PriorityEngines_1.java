package com.controllerface.cmdr_j.classes.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityEngines_1 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_1()
    {
        super(PowerDistributor_PriorityEngines_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 20d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 16d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -3d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -1d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
