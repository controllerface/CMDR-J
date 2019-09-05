package com.controllerface.cmdr_j.classes.recipes.distributor.eng;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityEngines_5 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityEngines_5()
    {
        super(PowerDistributor_PriorityEngines_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, 60d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, 44d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -15d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -15d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, -15d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, -5d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1));
    }
}
