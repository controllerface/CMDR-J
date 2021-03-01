package com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighFrequency_3 extends AbstractModificationRecipe
{
    public PowerDistributor_HighFrequency_3()
    {
        super(PowerDistributor_HighFrequency_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, -3d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, 27d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, -3d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, 27d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, -3d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, 27d)
                        ),
                new CostData(Material.CHEMICALDISTILLERY, 1),
                new CostData(Material.GRIDRESISTORS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
