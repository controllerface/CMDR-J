package com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighFrequency_3 extends AbstractModificationRecipe
{
    public PowerDistributor_HighFrequency_3()
    {
        super(PowerDistributor_HighFrequency_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 27d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 27d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 27d)
                        ),
                new CostData(Material.CHEMICALDISTILLERY, 1),
                new CostData(Material.GRIDRESISTORS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
