package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Optimised_2 extends AbstractModificationRecipe
{
    public ShieldGenerator_Optimised_2()
    {
        super(ShieldGenerator_Optimised_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -10d),
                                new ItemEffectData(ItemEffect.Mass, -26d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -3d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 9d),
                                new ItemEffectData(ItemEffect.PowerDraw, -25d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1));
    }
}
