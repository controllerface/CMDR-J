package com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighFrequency_4 extends AbstractModificationRecipe
{
    public PowerDistributor_HighFrequency_4()
    {
        super(PowerDistributor_HighFrequency_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -4d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 36d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -4d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 36d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -4d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 36d)
                        ),
                new CostData(Material.CHEMICALMANIPULATORS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1));
    }
}
