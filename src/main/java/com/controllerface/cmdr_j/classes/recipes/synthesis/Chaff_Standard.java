package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Chaff_Standard extends AbstractSynthesisRecipe_Standard
{
    public Chaff_Standard()
    {
        super("Chaff [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, "synthesized"),
                  new ItemEffectData(ItemEffect.Chaff_Duration_Increase, 1.0)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 1),
            new CostData(Material.FILAMENTCOMPOSITES, 2),
            new CostData(Material.THERMICALLOYS, 1));
    }
}