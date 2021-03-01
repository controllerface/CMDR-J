package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LongRange_4 extends AbstractModificationRecipe
{
    public Weapon_LongRange_4()
    {
        super(Weapon_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 80d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 25d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 12d),
                                new ItemEffectData(ItemEffect.Range_Percent, 80d)
                        ),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
