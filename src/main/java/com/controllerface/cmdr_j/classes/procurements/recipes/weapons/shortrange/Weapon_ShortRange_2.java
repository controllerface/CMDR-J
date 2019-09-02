package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_ShortRange_2 extends AbstractModifcationRecipe
{
    public Weapon_ShortRange_2()
    {
        super(Weapon_ShortRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage, 39d),
                                new ItemEffectData(ItemEffect.Range, -20d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 10d)
                        ),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.NICKEL, 1));
    }
}
