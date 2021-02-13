package com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_RapidFire_3 extends AbstractModificationRecipe
{
    public Weapon_RapidFire_3()
    {
        super(Weapon_RapidFire_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, -3d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, -15d),
                                new ItemEffectData(ItemEffect.Jitter, 0.5d),
                                new ItemEffectData(ItemEffect.ReloadTime_Percent, -45d),
                                new ItemEffectData(ItemEffect.RateOfFire_Percent, 26d)
                        ),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.PRECIPITATEDALLOYS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));

    }
}
