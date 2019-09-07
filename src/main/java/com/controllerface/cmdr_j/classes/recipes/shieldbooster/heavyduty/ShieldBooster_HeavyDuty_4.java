package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_HeavyDuty_4 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_4()
    {
        super(ShieldBooster_HeavyDuty_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 12d),
                                new ItemEffectData(ItemEffect.Mass, 250d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 37.2d)
                        ),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.TIN, 1));
    }
}
