package com.controllerface.cmdr_j.classes.procurements.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Focused_3 extends AbstractModificationRecipe
{
    public Weapon_Focused_3()
    {
        super(Weapon_Focused_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration, 80d),
                                new ItemEffectData(ItemEffect.Range, 68d),
                                new ItemEffectData(ItemEffect.RateOfFire, 68d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 3d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.IRON, 1));

    }
}