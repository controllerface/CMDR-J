package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Shock_Cannon_Turreted_Small extends AbstractTechnologyRecipe
{
    public Shock_Cannon_Turreted_Small()
    {
        super("Small Shock Cannon [Turreted]",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.VANADIUM, 8),
            new CostData(Material.TUNGSTEN, 12),
            new CostData(Material.RHENIUM, 10),
            new CostData(Material.TECHNETIUM, 10),
            new CostData(Commodity.IONDISTRIBUTOR, 4));
    }
}