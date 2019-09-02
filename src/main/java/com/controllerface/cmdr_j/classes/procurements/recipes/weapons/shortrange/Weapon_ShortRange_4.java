package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_ShortRange_4 extends AbstractModifcationRecipe
{
    public Weapon_ShortRange_4()
    {
        super(Weapon_ShortRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage, 63d),
                                new ItemEffectData(ItemEffect.Range, -40d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 30d)
                        ),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
