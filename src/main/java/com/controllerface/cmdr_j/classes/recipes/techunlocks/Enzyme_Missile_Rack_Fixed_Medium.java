package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Enzyme_Missile_Rack_Fixed_Medium extends AbstractTechnologyRecipe
{
    public Enzyme_Missile_Rack_Fixed_Medium()
    {
        super("Medium Enzyme Missile Rack [Fixed]",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.TUNGSTEN, 15),
            new CostData(Material.UNKNOWNENERGYCELL, 16),
            new CostData(Material.UNKNOWNORGANICCIRCUITRY, 18),
            new CostData(Material.MOLYBDENUM, 16),
            new CostData(Commodity.RADIATIONBAFFLE, 6));
    }
}