package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Double_Engineered_Medium_Seeker_Missile extends AbstractTechnologyRecipe
{
    public Double_Engineered_Medium_Seeker_Missile()
    {
        super("Engineered Seeker Missile Rack V1",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.PROTORADIOLICALLOYS, 16),
            new CostData(Material.CONDUCTIVECOMPONENTS, 24),
            new CostData(Material.HYBRIDCAPACITORS, 26),
            new CostData(Material.PHOSPHORUS, 28),
            new CostData(Commodity.OSMIUM, 10));
    }
}