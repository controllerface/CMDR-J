package com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_RapidFire_2 extends AbstractModificationRecipe
{
    public Weapon_RapidFire_2()
    {
        super(Weapon_RapidFire_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage, -2d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -5d),
                                new ItemEffectData(ItemEffect.Jitter, 50d),
                                new ItemEffectData(ItemEffect.ReloadTime, -35d),
                                new ItemEffectData(ItemEffect.RateOfFire, 17d)
                        ),
                new CostData(Material.HEATDISPERSIONPLATE, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
