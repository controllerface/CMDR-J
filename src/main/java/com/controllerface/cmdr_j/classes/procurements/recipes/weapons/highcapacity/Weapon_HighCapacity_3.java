package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.highcapacity;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_HighCapacity_3 extends AbstractModifcationRecipe
{
    public Weapon_HighCapacity_3()
    {
        super(Weapon_HighCapacity_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum, 68d),
                                new ItemEffectData(ItemEffect.AmmoClipSize, 68d),
                                new ItemEffectData(ItemEffect.Mass, 40d),
                                new ItemEffectData(ItemEffect.PowerDraw, 12d),
                                new ItemEffectData(ItemEffect.RateOfFire, 6d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
