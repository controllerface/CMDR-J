package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Weapon_Focused_4 extends AbstractModificationRecipe
{
    public Weapon_Focused_4()
    {
        super(Weapon_Focused_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration, 100d),
                                new ItemEffectData(ItemEffect.Range, 84d),
                                new ItemEffectData(ItemEffect.RateOfFire, 84d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 4d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.POLYMERCAPACITORS, 1));
    }
}
