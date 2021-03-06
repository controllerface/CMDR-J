package com.controllerface.cmdr_j.classes.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Sturdy_1 extends AbstractModificationRecipe
{
    public Weapon_Sturdy_1()
    {
        super(Weapon_Sturdy_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 100d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d),
                                new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 20d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -10d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
