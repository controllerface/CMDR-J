package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_HeavyDuty_2 extends AbstractModifcationRecipe
{
    public ShieldBooster_HeavyDuty_2()
    {
        super(ShieldBooster_HeavyDuty_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 6d),
                                new ItemEffectData(ItemEffect.Mass, 150d),
                                new ItemEffectData(ItemEffect.PowerDraw, 10d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 20.4d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1));
    }
}