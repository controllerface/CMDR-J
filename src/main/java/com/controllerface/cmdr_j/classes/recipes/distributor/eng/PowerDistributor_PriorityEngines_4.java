package com.controllerface.cmdr_j.classes.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PriorityEngines_4 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_4()
    {
        super(PowerDistributor_PriorityEngines_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 50d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 37d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -12d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -12d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -12d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -4d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.SELENIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
