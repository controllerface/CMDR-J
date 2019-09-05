package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_LongRange_5 extends AbstractModificationRecipe
{
    public Weapon_LongRange_5()
    {
        super(Weapon_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FalloffRange, 100d),
                                new ItemEffectData(ItemEffect.Mass, 30d),
                                new ItemEffectData(ItemEffect.PowerDraw, 15d),
                                new ItemEffectData(ItemEffect.Range, 100d),
                                new ItemEffectData(ItemEffect.ShotSpeed, 100d)
                        ),
                new CostData(Material.BIOTECHCONDUCTORS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
