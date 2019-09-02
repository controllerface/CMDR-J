package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityEngines_3 extends AbstractModifcationRecipe
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
