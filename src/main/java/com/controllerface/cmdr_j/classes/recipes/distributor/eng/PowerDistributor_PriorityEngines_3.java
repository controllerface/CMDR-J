package com.controllerface.cmdr_j.classes.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_PriorityEngines_3 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_3()
    {
        super(PowerDistributor_PriorityEngines_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 40d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 30d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -9d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -9d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -9d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -3d)
                        ),
                new CostData(Material.BULKSCANDATA, 1),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1));
    }
}
