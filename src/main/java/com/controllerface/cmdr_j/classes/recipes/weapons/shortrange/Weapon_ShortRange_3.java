package com.controllerface.cmdr_j.classes.recipes.weapons.shortrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_ShortRange_3 extends AbstractModificationRecipe
{
    public Weapon_ShortRange_3()
    {
        super(Weapon_ShortRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Damage_Percent, 51d),
                                new ItemEffectData(ItemEffect.Range_Percent, -30d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 20d)
                        ),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.NICKEL, 1));
    }
}
