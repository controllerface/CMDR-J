package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Hull_Reinforcement extends AbstractTechnologyRecipe
{
    public Guardian_Hull_Reinforcement()
    {
        super("Guardian Hull Reinforcement", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 21),
            new CostData(Material.ANCIENTCULTURALDATA, 16),
            new CostData(Material.ANCIENTHISTORICALDATA, 16),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12));
    }
}