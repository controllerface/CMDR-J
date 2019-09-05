package com.controllerface.cmdr_j.classes.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_ShortRange_3 extends AbstractModificationRecipe
{
    public Weapon_ShortRange_3()
    {
        super(Weapon_ShortRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage, 51d),
                                new ItemEffectData(ItemEffect.Range, -30d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 20d)
                        ),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.NICKEL, 1));
    }
}
