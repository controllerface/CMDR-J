package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Focused_2 extends AbstractModificationRecipe
{
    public Weapon_Focused_2()
    {
        super(Weapon_Focused_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 60d),
                                new ItemEffectData(ItemEffect.Range_Percent, 52d),
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 52d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 2d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.IRON, 1));
    }
}
