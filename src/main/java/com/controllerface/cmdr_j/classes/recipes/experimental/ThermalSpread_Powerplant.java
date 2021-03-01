package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ThermalSpread_Powerplant extends AbstractExperimentalRecipe
{
    public ThermalSpread_Powerplant()
    {
        super("Thermal Spread", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -10.0)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.HEATVANES, 1));
    }
}