package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_2 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_2()
    {
        super(Weapon_HighCapacity_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum_Percent, 52d),
                                new ItemEffectData(ItemEffect.AmmoClipSize_Percent, 52d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 30d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 8d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 4d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
