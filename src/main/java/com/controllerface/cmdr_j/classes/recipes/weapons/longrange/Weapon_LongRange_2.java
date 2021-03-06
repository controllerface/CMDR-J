package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LongRange_2 extends AbstractModificationRecipe
{
    public Weapon_LongRange_2()
    {
        super(Weapon_LongRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 40d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 6d),
                                new ItemEffectData(ItemEffect.Range_Percent, 40d)
                        ),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
