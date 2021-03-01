package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_5 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_5()
    {
        super(Weapon_HighCapacity_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum_Percent, 100d),
                                new ItemEffectData(ItemEffect.AmmoClipSize_Percent, 100d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 20d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 10d)
                        ),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
