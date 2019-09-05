package com.controllerface.cmdr_j.classes.recipes.distributor.wep;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityWeapons_4 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityWeapons_4()
    {
        super(PowerDistributor_PriorityWeapons_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -12d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -12d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -12d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -4d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 50d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 37d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.SELENIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
