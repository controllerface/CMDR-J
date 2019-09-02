package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityEngines_2 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_2()
    {
        super(PowerDistributor_PriorityEngines_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 30d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 23d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -6d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -6d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -6d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -2d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
