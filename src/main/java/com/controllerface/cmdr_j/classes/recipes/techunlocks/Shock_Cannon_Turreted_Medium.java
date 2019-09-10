package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Shock_Cannon_Turreted_Medium extends AbstractTechnologyRecipe
{
    public Shock_Cannon_Turreted_Medium()
    {
        super("Shock Cannon Turreted Medium", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.VANADIUM, 24),
            new CostData(Material.TUNGSTEN, 22),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Commodity.POWERTRANSFERCONDUITS, 8));
    }
}