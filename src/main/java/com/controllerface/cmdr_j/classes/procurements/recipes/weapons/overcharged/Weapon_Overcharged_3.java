package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Overcharged_3 extends AbstractModificationRecipe
{
    public Weapon_Overcharged_3()
    {
        super(Weapon_Overcharged_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoClipSize, -9d),
                                new ItemEffectData(ItemEffect.Damage, 50d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 25d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 9d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.NICKEL, 1));

    }
}
