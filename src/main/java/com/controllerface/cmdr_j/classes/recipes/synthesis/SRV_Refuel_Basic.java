package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Refuel_Basic extends AbstractSynthesisRecipe_Basic
{
    public SRV_Refuel_Basic()
    {
        super("SRV Refuel [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refuel, "synthesized")
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.PHOSPHORUS, 1));
    }
}