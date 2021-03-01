package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ClusterCapacitors extends AbstractExperimentalRecipe
{
    public ClusterCapacitors()
    {
        super("Cluster Capacitors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.WeaponsCapacity_Percent, 8.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge_Percent, -2.0),
                  new ItemEffectData(ItemEffect.EnginesCapacity_Percent, 8.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge_Percent, -2.0),
                  new ItemEffectData(ItemEffect.SystemsCapacity_Percent, 8.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge_Percent, -2.0)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CADMIUM, 1));
    }
}