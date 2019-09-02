package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Sturdy_1 extends AbstractModifcationRecipe
{
    public Weapon_Sturdy_1()
    {
        super(Weapon_Sturdy_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 100d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.ArmourPenetration, 20d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -10d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
