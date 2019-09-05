package com.controllerface.cmdr_j.classes.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_ShortRange_1 extends AbstractModificationRecipe
{
    public Weapon_ShortRange_1()
    {
        super(Weapon_ShortRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage, 27d),
                                new ItemEffectData(ItemEffect.Range, -10d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
