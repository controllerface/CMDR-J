package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_HeavyDuty_1 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_1()
    {
        super(ShieldBooster_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 3d),
                                new ItemEffectData(ItemEffect.Mass, 100d),
                                new ItemEffectData(ItemEffect.PowerDraw, 5d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 12d)
                        ),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
