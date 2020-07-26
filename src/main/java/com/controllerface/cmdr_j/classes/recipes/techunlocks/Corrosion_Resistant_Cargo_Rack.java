package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Corrosion_Resistant_Cargo_Rack extends AbstractTechnologyRecipe
{
    public Corrosion_Resistant_Cargo_Rack()
    {
        super("Corrosion Resistant Cargo Rack", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.tech_unlock, 1.0)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 18),
            new CostData(Material.IRON, 26),
            new CostData(Commodity.METAALLOYS, 16),
            new CostData(Commodity.RADIATIONBAFFLE, 22),
            new CostData(Commodity.NEOFABRICINSULATION, 12));
    }
}