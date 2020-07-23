package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ThermalVent extends AbstractExperimentalRecipe
{
    public ThermalVent()
    {
        super("Thermal Vent", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Heat_Reduced_when_Striking_Target, 0.0)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.CONDUCTIVEPOLYMERS, 3),
            new CostData(Material.PRECIPITATEDALLOYS, 3));
    }
}