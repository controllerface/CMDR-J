package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
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
                                new ItemEffectData(ItemEffect.AmmoMaximum, 52d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 52d),
                                new ItemEffectData(ItemEffect.Mass, 30d),
                                new ItemEffectData(ItemEffect.PowerDraw, 8d),
                                new ItemEffectData(ItemEffect.RateOfFire, 4d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
