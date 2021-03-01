package com.controllerface.cmdr_j.classes.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PrioritySystems_5 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_5()
    {
        super(PowerDistributor_PrioritySystems_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, -15d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, -5d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, 60d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, 44d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, -15d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -15d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1));
    }
}
