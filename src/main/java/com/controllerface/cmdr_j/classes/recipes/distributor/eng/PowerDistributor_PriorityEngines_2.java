package com.controllerface.cmdr_j.classes.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PriorityEngines_2 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_2()
    {
        super(PowerDistributor_PriorityEngines_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, 30d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, 23d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, -6d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, -6d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, -6d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -2d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
