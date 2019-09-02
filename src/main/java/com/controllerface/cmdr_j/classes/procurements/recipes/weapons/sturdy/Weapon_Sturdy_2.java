package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Sturdy_2 extends AbstractModifcationRecipe
{
    public Weapon_Sturdy_2()
    {
        super(Weapon_Sturdy_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 150d),
                                new ItemEffectData(ItemEffect.Mass, 40d),
                                new ItemEffectData(ItemEffect.ArmourPenetration, 30d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -15d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
