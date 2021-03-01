package com.controllerface.cmdr_j.classes.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Overcharged_2 extends AbstractModificationRecipe
{
    public Weapon_Overcharged_2()
    {
        super(Weapon_Overcharged_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, 40d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, 20d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 6d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.NICKEL, 1));
    }
}
