package com.controllerface.cmdr_j.classes.recipes.distributor.wep;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_PriorityWeapons_5 extends AbstractModificationRecipe
{
    public PowerDistributor_PriorityWeapons_5()
    {
        super(PowerDistributor_PriorityWeapons_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EnginesCapacity, -15d),
                                new ItemEffectData(ItemEffect.EnginesRecharge, -15d),
                                new ItemEffectData(ItemEffect.SystemsCapacity, -15d),
                                new ItemEffectData(ItemEffect.SystemsRecharge, -5d),
                                new ItemEffectData(ItemEffect.WeaponsCapacity, 60d),
                                new ItemEffectData(ItemEffect.WeaponsRecharge, 44d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1));
    }
}
