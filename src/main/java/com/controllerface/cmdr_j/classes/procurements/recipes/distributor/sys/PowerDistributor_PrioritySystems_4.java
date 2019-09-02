package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PrioritySystems_4 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_4()
    {
        super(PowerDistributor_PrioritySystems_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -12d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -4d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 50d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 37d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -12d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -12d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.SELENIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
