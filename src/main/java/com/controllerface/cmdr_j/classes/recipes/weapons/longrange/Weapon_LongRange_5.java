package com.controllerface.cmdr_j.classes.recipes.weapons.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LongRange_5 extends AbstractModificationRecipe
{
    public Weapon_LongRange_5()
    {
        super(Weapon_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamageFalloffRange_Percent, 100d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 30d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 15d),
                                new ItemEffectData(ItemEffect.Range_Percent, 100d)
                        ),
                new CostData(Material.BIOTECHCONDUCTORS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
