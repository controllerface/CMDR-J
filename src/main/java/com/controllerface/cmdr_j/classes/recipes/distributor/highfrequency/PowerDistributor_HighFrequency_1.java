package com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighFrequency_1 extends AbstractModificationRecipe
{
    public PowerDistributor_HighFrequency_1()
    {
        super(PowerDistributor_HighFrequency_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -1d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 9d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -1d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 9d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -1d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 9d)
                        ),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
