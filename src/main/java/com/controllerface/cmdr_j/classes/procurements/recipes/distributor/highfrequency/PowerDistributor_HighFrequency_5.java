package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighFrequency_5 extends AbstractModifcationRecipe
{
    public PowerDistributor_HighFrequency_5()
    {
        super(PowerDistributor_HighFrequency_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -5d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 45d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -5d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 45d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -5d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 45d)
                        ),
                new CostData(Material.CHEMICALMANIPULATORS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1));
    }
}
