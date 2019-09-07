package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Optimised_3 extends AbstractModificationRecipe
{
    public ShieldGenerator_Optimised_3()
    {
        super(ShieldGenerator_Optimised_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -15d),
                                new ItemEffectData(ItemEffect.Mass, -34d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -4d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 13.5d),
                                new ItemEffectData(ItemEffect.PowerDraw, -30d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.PRECIPITATEDALLOYS, 1));
    }
}
