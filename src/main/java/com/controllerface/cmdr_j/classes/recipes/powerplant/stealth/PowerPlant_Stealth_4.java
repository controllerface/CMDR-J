package com.controllerface.cmdr_j.classes.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Stealth_4 extends AbstractModificationRecipe
{
    public PowerPlant_Stealth_4()
    {
        super(PowerPlant_Stealth_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -55d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 16d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, -12d)
                        ),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
