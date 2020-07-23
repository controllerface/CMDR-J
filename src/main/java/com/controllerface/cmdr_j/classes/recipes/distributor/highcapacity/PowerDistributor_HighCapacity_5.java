package com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighCapacity_5 extends AbstractModificationRecipe
{
    public PowerDistributor_HighCapacity_5()
    {
        super(PowerDistributor_HighCapacity_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 42d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -18d),
                                new ItemEffectData(ItemEffect.Integrity, 30d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 42d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -18d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 42d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -18d)
                        ),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
