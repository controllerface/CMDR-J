package com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighCapacity_3 extends AbstractModificationRecipe
{
    public PowerDistributor_HighCapacity_3()
    {
        super(PowerDistributor_HighCapacity_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 26d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -10d),
                                new ItemEffectData(ItemEffect.Integrity, 20d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 26d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -10d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 26d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -10d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
