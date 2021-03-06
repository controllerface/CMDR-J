package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Focused_4 extends AbstractModificationRecipe
{
    public Weapon_Focused_4()
    {
        super(Weapon_Focused_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 100d),
                                new ItemEffectData(ItemEffect.Range_Percent, 84d),
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 84d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 4d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
