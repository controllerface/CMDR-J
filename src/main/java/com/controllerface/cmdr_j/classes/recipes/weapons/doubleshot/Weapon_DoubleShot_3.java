package com.controllerface.cmdr_j.classes.recipes.weapons.doubleshot;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_DoubleShot_3 extends AbstractModificationRecipe
{
    public Weapon_DoubleShot_3()
    {
        super(Weapon_DoubleShot_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BurstSize, 2d),
                                new ItemEffectData(ItemEffect.BurstRateOfFire_Percent, 1000d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                                new ItemEffectData(ItemEffect.Range_Percent, -6d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1));

    }
}
