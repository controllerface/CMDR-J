package com.controllerface.cmdr_j.classes.recipes.weapons.sturdy;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Sturdy_5 extends AbstractModificationRecipe
{
    public Weapon_Sturdy_5()
    {
        super(Weapon_Sturdy_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 300d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 100d),
                                new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 60d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -30d)
                        ),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.TECHNETIUM, 1));
    }
}
