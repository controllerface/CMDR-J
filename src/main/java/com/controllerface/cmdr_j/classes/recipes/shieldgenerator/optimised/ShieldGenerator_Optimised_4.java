package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Optimised_4 extends AbstractModificationRecipe
{
    public ShieldGenerator_Optimised_4()
    {
        super(ShieldGenerator_Optimised_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -20d),
                                new ItemEffectData(ItemEffect.Mass, -42d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -5d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 18d),
                                new ItemEffectData(ItemEffect.PowerDraw, -35d)
                        ),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
