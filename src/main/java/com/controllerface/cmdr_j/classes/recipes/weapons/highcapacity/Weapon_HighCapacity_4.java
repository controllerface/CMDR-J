package com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_HighCapacity_4 extends AbstractModificationRecipe
{
    public Weapon_HighCapacity_4()
    {
        super(Weapon_HighCapacity_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum, 84d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 84d),
                                new ItemEffectData(ItemEffect.Mass, 50d),
                                new ItemEffectData(ItemEffect.PowerDraw, 16d),
                                new ItemEffectData(ItemEffect.RateOfFire, 8d)
                        ),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.TIN, 1));
    }
}
