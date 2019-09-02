package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.efficient;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Efficient_1 extends AbstractModifcationRecipe
{
    public Weapon_Efficient_1()
    {
        super(Weapon_Efficient_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamagePerSecond, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -38d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
