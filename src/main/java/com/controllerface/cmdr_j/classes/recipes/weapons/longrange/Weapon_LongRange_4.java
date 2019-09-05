package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_LongRange_4 extends AbstractModificationRecipe
{
    public Weapon_LongRange_4()
    {
        super(Weapon_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FalloffRange, 80d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.PowerDraw, 12d),
                                new ItemEffectData(ItemEffect.Range, 80d),
                                new ItemEffectData(ItemEffect.ShotSpeed, 80d)
                        ),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
