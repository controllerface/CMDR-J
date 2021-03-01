package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
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
                                new ItemEffectData(ItemEffect.Integrity_Percent, -20d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -42d),
                                new ItemEffectData(ItemEffect.ShieldGenOptimalMass_Percent, -5d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 12d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -35d)
                        ),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
