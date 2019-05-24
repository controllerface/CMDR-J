package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_HeavyDuty_3 extends AbstractModifcationRecipe
{
    public ShieldBooster_HeavyDuty_3()
    {
        super(ShieldBooster_HeavyDuty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 9d),
                                new ItemEffectData(ItemEffect.Mass, 200d),
                                new ItemEffectData(ItemEffect.PowerDraw, 15d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 28.8d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
