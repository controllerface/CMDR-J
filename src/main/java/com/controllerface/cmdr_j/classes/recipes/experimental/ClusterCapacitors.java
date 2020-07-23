package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ClusterCapacitors extends AbstractExperimentalRecipe
{
    public ClusterCapacitors()
    {
        super("Cluster Capacitors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 8.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, -2.0),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 8.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, -2.0),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 8.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, -2.0)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CADMIUM, 1));
    }
}