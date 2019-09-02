package com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Stealth_4 extends AbstractModifcationRecipe
{
    public PowerPlant_Stealth_4()
    {
        super(PowerPlant_Stealth_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -55d),
                                new ItemEffectData(ItemEffect.Mass, 16d),
                                new ItemEffectData(ItemEffect.PowerCapacity, -12d)
                        ),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
