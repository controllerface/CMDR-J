package com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighCapacity_1 extends AbstractModificationRecipe
{
    public PowerDistributor_HighCapacity_1()
    {
        super(PowerDistributor_HighCapacity_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 10d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -2d),
                                new ItemEffectData(ItemEffect.Integrity, 10d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 10d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -2d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 10d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -2d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
