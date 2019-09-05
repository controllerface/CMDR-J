package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_LongRange_3 extends AbstractModificationRecipe
{
    public Weapon_LongRange_3()
    {
        super(Weapon_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FalloffRange, 60d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.PowerDraw, 9d),
                                new ItemEffectData(ItemEffect.Range, 60d),
                                new ItemEffectData(ItemEffect.ShotSpeed, 60d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
