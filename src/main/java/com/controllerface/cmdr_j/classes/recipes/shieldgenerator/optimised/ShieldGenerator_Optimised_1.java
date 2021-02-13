package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Optimised_1 extends AbstractModificationRecipe
{
    public ShieldGenerator_Optimised_1()
    {
        super(ShieldGenerator_Optimised_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -5d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -18d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass_Percent, -2d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 3d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -20d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1));
    }
}
