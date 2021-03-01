package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Heat_Sink_Basic extends AbstractSynthesisRecipe_Basic
{
    public Heat_Sink_Basic()
    {
        super("Heat Sink [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized")
            ),
            new CostData(Material.BASICCONDUCTORS, 2),
            new CostData(Material.HEATCONDUCTIONWIRING, 2));
    }
}