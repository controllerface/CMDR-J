package com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_RapidFire_4 extends AbstractModificationRecipe
{
    public Weapon_RapidFire_4()
    {
        super(Weapon_RapidFire_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, -4d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, -25d),
                                new ItemEffectData(ItemEffect.Jitter, 0.5d),
                                new ItemEffectData(ItemEffect.ReloadTime_Percent, -56d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 35d)
                        ),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
