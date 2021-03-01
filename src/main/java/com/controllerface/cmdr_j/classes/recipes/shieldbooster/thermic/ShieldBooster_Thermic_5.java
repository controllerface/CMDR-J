package com.controllerface.cmdr_j.classes.recipes.shieldbooster.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Thermic_5 extends AbstractModificationRecipe
{
    public ShieldBooster_Thermic_5()
    {
        super(ShieldBooster_Thermic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, -4d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 27d)
                        ),
                new CostData(Material.SHIELDPATTERNANALYSIS, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
                new CostData(Material.HEATEXCHANGERS, 1));
    }
}
