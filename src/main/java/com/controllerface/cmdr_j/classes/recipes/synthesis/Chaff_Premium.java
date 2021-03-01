package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Chaff_Premium extends AbstractSynthesisRecipe_Premium
{
    public Chaff_Premium()
    {
        super("Chaff [Premium]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized"),
                  new ItemEffectData(ItemEffect.Chaff_Duration_Increase, 2.0)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 1),
            new CostData(Material.FILAMENTCOMPOSITES, 2),
            new CostData(Material.THERMICALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1));
    }
}