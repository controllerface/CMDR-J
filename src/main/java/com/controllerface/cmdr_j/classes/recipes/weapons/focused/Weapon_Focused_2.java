package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Focused_2 extends AbstractModificationRecipe
{
    public Weapon_Focused_2()
    {
        super(Weapon_Focused_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration, 60d),
                                new ItemEffectData(ItemEffect.Range, 52d),
                                new ItemEffectData(ItemEffect.RateOfFire, 52d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 2d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.IRON, 1));
    }
}
