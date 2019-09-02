package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_LongRange_1 extends AbstractModificationRecipe
{
    public Weapon_LongRange_1()
    {
        super(Weapon_LongRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FalloffRange, 20d),
                                new ItemEffectData(ItemEffect.Mass, 10d),
                                new ItemEffectData(ItemEffect.PowerDraw, 3d),
                                new ItemEffectData(ItemEffect.Range, 20d),
                                new ItemEffectData(ItemEffect.ShotSpeed, 20d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
