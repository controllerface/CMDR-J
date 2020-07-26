package com.controllerface.cmdr_j.classes.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Overcharged_2 extends AbstractModificationRecipe
{
    public Weapon_Overcharged_2()
    {
        super(Weapon_Overcharged_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoClipSize, -6d),
                                new ItemEffectData(ItemEffect.Damage, 40d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 20d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 6d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.NICKEL, 1));
    }
}
