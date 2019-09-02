package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Focused_1 extends AbstractModifcationRecipe
{
    public Weapon_Focused_1()
    {
        super(Weapon_Focused_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration, 40d),
                                new ItemEffectData(ItemEffect.Range, 36d),
                                new ItemEffectData(ItemEffect.RateOfFire, 36d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 1d)
                        ),
                new CostData(Material.IRON, 1));

    }
}
