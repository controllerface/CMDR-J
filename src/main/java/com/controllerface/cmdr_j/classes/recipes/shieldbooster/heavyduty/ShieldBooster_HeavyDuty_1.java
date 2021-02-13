package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_HeavyDuty_1 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_1()
    {
        super(ShieldBooster_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 3d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 100d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 5d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 10d)
                        ),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
