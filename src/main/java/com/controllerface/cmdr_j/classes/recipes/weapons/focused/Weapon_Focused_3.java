package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Focused_3 extends AbstractModificationRecipe
{
    public Weapon_Focused_3()
    {
        super(Weapon_Focused_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 80d),
                                new ItemEffectData(ItemEffect.Range_Percent, 68d),
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 68d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 3d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.IRON, 1));

    }
}
