package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
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
                                new ItemEffectData(ItemEffect.Integrity_Percent, -15d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -34d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass_Percent, -4d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 9d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -30d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.PRECIPITATEDALLOYS, 1));
    }
}
