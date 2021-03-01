package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Heat_Sink_Premium extends AbstractSynthesisRecipe_Premium
{
    public Heat_Sink_Premium()
    {
        super("Heat Sink [Premium]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized"),
                  new ItemEffectData(ItemEffect.Heat_Dissipation_Increase, 30.0)
            ),
            new CostData(Material.BASICCONDUCTORS, 2),
            new CostData(Material.HEATCONDUCTIONWIRING, 2),
            new CostData(Material.HEATEXCHANGERS, 2),
            new CostData(Material.PROTOHEATRADIATORS, 1));
    }
}