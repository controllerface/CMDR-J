package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.doubleshot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_DoubleShot_3 extends AbstractModificationRecipe
{
    public Weapon_DoubleShot_3()
    {
        super(Weapon_DoubleShot_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BurstSize, 2d),
                                new ItemEffectData(ItemEffect.BurstRateOfFire, 1000d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                                new ItemEffectData(ItemEffect.Range, -6d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1));

    }
}
