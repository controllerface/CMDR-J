package com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_RapidFire_5 extends AbstractModificationRecipe
{
    public Weapon_RapidFire_5()
    {
        super(Weapon_RapidFire_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, -5d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, -35d),
                                new ItemEffectData(ItemEffect.Jitter, 0.5d),
                                new ItemEffectData(ItemEffect.ReloadTime_Percent, -65d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 44d)
                        ),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.PRECIPITATEDALLOYS, 1),
                new CostData(Material.TECHNETIUM, 1));
    }
}
