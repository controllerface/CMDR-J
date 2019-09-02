package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Overcharged_1 extends AbstractModifcationRecipe
{
    public Weapon_Overcharged_1()
    {
        super(Weapon_Overcharged_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoClipSize, -3d),
                                new ItemEffectData(ItemEffect.Damage, 30d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 15d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 3d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
