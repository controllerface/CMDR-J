package com.controllerface.cmdr_j.classes.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Sturdy_2 extends AbstractModificationRecipe
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
