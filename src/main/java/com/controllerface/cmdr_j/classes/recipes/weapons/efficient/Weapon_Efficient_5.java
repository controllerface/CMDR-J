package com.controllerface.cmdr_j.classes.recipes.weapons.efficient;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Efficient_5 extends AbstractModificationRecipe
{
    public Weapon_Efficient_5()
    {
        super(Weapon_Efficient_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamagePerSecond, 24d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -45d),
                                new ItemEffectData(ItemEffect.PowerDraw, -45d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -60d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.PROTOHEATRADIATORS, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
