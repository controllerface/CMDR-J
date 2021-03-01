package com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_HighCapacity_4 extends AbstractModificationRecipe
{
    public PowerDistributor_HighCapacity_4()
    {
        super(PowerDistributor_HighCapacity_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity_Percent, 34d),
                                new ItemEffectData(ItemEffect.EnginesRecharge_Percent, -14d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, 25d),
                                new ItemEffectData(ItemEffect.SystemsCapacity_Percent, 34d),
                                new ItemEffectData(ItemEffect.SystemsRecharge_Percent, -14d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, 34d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -14d)
                        ),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
