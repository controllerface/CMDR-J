package com.controllerface.cmdr_j.classes.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Sturdy_3 extends AbstractModificationRecipe
{
    public Weapon_Sturdy_3()
    {
        super(Weapon_Sturdy_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 200d),
                                new ItemEffectData(ItemEffect.Mass, 60d),
                                new ItemEffectData(ItemEffect.ArmourPenetration, 40d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -20d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.SHIELDEMITTERS, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
