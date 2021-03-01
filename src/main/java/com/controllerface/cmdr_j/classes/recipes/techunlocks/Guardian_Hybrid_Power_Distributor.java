package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Hybrid_Power_Distributor extends AbstractTechnologyRecipe
{
    public Guardian_Hybrid_Power_Distributor()
    {
        super("Guardian Hybrid Power Distributor", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.ANCIENTBIOLOGICALDATA, 20),
            new CostData(Material.GUARDIAN_POWERCELL, 24),
            new CostData(Material.PHASEALLOYS, 18),
            new CostData(Commodity.HEATSINKINTERLINK, 6));
    }
}