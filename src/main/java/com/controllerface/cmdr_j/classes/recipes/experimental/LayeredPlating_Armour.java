package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LayeredPlating_Armour extends AbstractExperimentalRecipe
{
    public LayeredPlating_Armour()
    {
        super("Layered Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 8.0)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.NIOBIUM, 1));
    }
}