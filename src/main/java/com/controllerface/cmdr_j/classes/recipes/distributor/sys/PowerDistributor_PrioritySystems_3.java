package com.controllerface.cmdr_j.classes.recipes.distributor.sys;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PrioritySystems_3 extends AbstractModificationRecipe
{
    public PowerDistributor_PrioritySystems_3()
    {
        super(PowerDistributor_PrioritySystems_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -9d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -3d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, 40d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, 30d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -9d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -9d)
                        ),
                new CostData(Material.BULKSCANDATA, 1),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1));
    }
}
