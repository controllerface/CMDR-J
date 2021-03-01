package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_HeavyDuty_2 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_2()
    {
        super(ShieldBooster_HeavyDuty_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 6d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 150d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 17d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1));
    }
}
