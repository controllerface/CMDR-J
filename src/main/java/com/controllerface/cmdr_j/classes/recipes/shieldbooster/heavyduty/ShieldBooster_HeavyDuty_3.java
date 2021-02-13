package com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_HeavyDuty_3 extends AbstractModificationRecipe
{
    public ShieldBooster_HeavyDuty_3()
    {
        super(ShieldBooster_HeavyDuty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 9d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 200d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 15d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 24d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
