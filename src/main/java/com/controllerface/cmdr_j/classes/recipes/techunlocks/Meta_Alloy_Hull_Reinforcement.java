package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Meta_Alloy_Hull_Reinforcement extends AbstractTechnologyRecipe
{
    public Meta_Alloy_Hull_Reinforcement()
    {
        super("Meta Alloy Hull Reinforcement", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.FOCUSCRYSTALS, 15),
            new CostData(Material.SHIELDPATTERNANALYSIS, 22),
            new CostData(Material.CONFIGURABLECOMPONENTS, 20),
            new CostData(Commodity.METAALLOYS, 16),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12));
    }
}