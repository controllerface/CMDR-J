package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighCapacity_4 extends AbstractModifcationRecipe
{
    public PowerDistributor_HighCapacity_4()
    {
        super(PowerDistributor_HighCapacity_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 34d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -14d),
                                new ItemEffectData(ItemEffect.Integrity, 25d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 34d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -14d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 34d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -14d)
                        ),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
