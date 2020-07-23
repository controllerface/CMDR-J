package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LayeredPlating_HullReinforcement extends AbstractExperimentalRecipe
{
    public LayeredPlating_HullReinforcement()
    {
        super("Layered Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -5.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 2.0)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.TUNGSTEN, 3));
    }
}