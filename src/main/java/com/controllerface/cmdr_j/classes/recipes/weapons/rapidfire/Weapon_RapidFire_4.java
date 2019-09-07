package com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
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
                                new ItemEffectData(ItemEffect.Damage, -4d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -25d),
                                new ItemEffectData(ItemEffect.Jitter, 50d),
                                new ItemEffectData(ItemEffect.ReloadTime, -55d),
                                new ItemEffectData(ItemEffect.RateOfFire, 35d)
                        ),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
