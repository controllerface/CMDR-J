package com.controllerface.cmdr_j.classes.recipes.weapons.doubleshot;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_DoubleShot_5 extends AbstractModificationRecipe
{
    public Weapon_DoubleShot_5()
    {
        super(Weapon_DoubleShot_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BurstSize, 2d),
                                new ItemEffectData(ItemEffect.BurstRateOfFire, 1400d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 6d),
                                new ItemEffectData(ItemEffect.Range, -10d)
                        ),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.EMBEDDEDFIRMWARE, 1));
    }
}
