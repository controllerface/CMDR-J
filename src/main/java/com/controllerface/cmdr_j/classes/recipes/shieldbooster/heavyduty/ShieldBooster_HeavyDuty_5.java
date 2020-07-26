package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_HeavyDuty_5 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_5()
    {
        super(ShieldBooster_HeavyDuty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 15d),
                                new ItemEffectData(ItemEffect.Mass, 300d),
                                new ItemEffectData(ItemEffect.PowerDraw, 25d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 45.6d)
                        ),
                new CostData(Material.ANTIMONY, 1),
                new CostData(Material.POLYMERCAPACITORS, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
