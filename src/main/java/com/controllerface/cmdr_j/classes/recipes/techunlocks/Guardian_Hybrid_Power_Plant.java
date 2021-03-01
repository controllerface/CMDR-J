package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Hybrid_Power_Plant extends AbstractTechnologyRecipe
{
    public Guardian_Hybrid_Power_Plant()
    {
        super("Guardian Hybrid Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Hybrid_Power, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 18),
            new CostData(Material.ANCIENTTECHNOLOGICALDATA, 21),
            new CostData(Material.HEATRESISTANTCERAMICS, 15),
            new CostData(Commodity.POWERGRIDASSEMBLY, 10));
    }
}