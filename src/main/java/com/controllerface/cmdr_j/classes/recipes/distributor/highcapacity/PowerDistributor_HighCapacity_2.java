package com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_HighCapacity_2 extends AbstractModificationRecipe
{
    public PowerDistributor_HighCapacity_2()
    {
        super(PowerDistributor_HighCapacity_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 18d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -6d),
                                new ItemEffectData(ItemEffect.Integrity, 15d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 18d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -6d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 18d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -6d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
