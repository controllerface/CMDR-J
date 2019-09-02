package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_LongRange_2 extends AbstractModifcationRecipe
{
    public Weapon_LongRange_2()
    {
        super(Weapon_LongRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FalloffRange, 40d),
                                new ItemEffectData(ItemEffect.Mass, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw, 6d),
                                new ItemEffectData(ItemEffect.Range, 40d),
                                new ItemEffectData(ItemEffect.ShotSpeed, 40d)
                        ),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
