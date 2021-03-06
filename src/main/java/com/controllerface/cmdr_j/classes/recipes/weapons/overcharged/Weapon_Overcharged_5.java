package com.controllerface.cmdr_j.classes.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Overcharged_5 extends AbstractModificationRecipe
{
    public Weapon_Overcharged_5()
    {
        super(Weapon_Overcharged_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, 70d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, 35d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 15d)
                        ),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.EMBEDDEDFIRMWARE, 1),
                new CostData(Material.ZIRCONIUM, 1));
    }
}
