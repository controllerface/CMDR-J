package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class InertialImpact extends AbstractExperimentalRecipe
{
    public InertialImpact()
    {
        super("Inertial Impact", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Damage_Partially_Kinetic, 0.0),
                  new ItemEffectData(ItemEffect.Damage, 50.0),
                  new ItemEffectData(ItemEffect.Jitter, 3.0)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5));
    }
}