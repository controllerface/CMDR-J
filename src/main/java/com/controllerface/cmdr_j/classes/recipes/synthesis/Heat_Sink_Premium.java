package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Heat_Sink_Premium extends AbstractSynthesisRecipe_Premium
{
    public Heat_Sink_Premium()
    {
        super("Heat Sink Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, 0.0),
                  new ItemEffectData(ItemEffect.Heat_Dissipation, 30.0)
            ),
            new CostData(Material.BASICCONDUCTORS, 2),
            new CostData(Material.HEATCONDUCTIONWIRING, 2),
            new CostData(Material.HEATEXCHANGERS, 2),
            new CostData(Material.PROTOHEATRADIATORS, 1));
    }
}