package com.controllerface.cmdr_j.classes.recipes.weapons.focused;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Focused_5 extends AbstractModificationRecipe
{
    public Weapon_Focused_5()
    {
        super(Weapon_Focused_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ArmourPenetration, 120d),
                                new ItemEffectData(ItemEffect.Range, 100d),
                                new ItemEffectData(ItemEffect.RateOfFire, 100d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 5d)
                        ),
                new CostData(Material.MILITARYSUPERCAPACITORS, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
