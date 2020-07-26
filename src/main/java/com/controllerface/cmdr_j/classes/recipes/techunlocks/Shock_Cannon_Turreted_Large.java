package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Shock_Cannon_Turreted_Large extends AbstractTechnologyRecipe
{
    public Shock_Cannon_Turreted_Large()
    {
        super("Shock Cannon Turreted Large", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.VANADIUM, 26),
            new CostData(Material.TUNGSTEN, 28),
            new CostData(Material.RHENIUM, 22),
            new CostData(Material.TECHNETIUM, 24),
            new CostData(Commodity.IONDISTRIBUTOR, 10));
    }
}