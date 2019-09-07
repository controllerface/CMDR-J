package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Optimised_5 extends AbstractModificationRecipe
{
    public ShieldGenerator_Optimised_5()
    {
        super(ShieldGenerator_Optimised_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -25d),
                                new ItemEffectData(ItemEffect.Mass, -50d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -6d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 22.5d),
                                new ItemEffectData(ItemEffect.PowerDraw, -40d)
                        ),
                new CostData(Material.MILITARYGRADEALLOYS, 1),
                new CostData(Material.TIN, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
