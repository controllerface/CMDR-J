package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ThermoBlock_Shield extends AbstractExperimentalRecipe
{
    public ThermoBlock_Shield()
    {
        super("Thermo Block", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -3.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 8.0)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.HEATVANES, 1));
    }
}