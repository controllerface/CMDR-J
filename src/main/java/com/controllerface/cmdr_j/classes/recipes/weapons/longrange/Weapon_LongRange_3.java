package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LongRange_3 extends AbstractModificationRecipe
{
    public Weapon_LongRange_3()
    {
        super(Weapon_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 60d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 9d),
                                new ItemEffectData(ItemEffect.Range_Percent, 60d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
