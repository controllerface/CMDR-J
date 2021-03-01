package com.controllerface.cmdr_j.classes.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PrioritySystems_4 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_4()
    {
        super(PowerDistributor_PrioritySystems_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, -12d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, -4d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, 50d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, 37d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, -12d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -12d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.SELENIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
