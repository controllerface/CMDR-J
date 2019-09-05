package com.controllerface.cmdr_j.classes.recipes.shieldbooster.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Thermic_5 extends AbstractModificationRecipe
{
    public ShieldBooster_Thermic_5()
    {
        super(ShieldBooster_Thermic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -5d),
                                new ItemEffectData(ItemEffect.KineticResistance, -5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 27d)
                        ),
                new CostData(Material.SHIELDPATTERNANALYSIS, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
                new CostData(Material.HEATEXCHANGERS, 1));
    }
}
