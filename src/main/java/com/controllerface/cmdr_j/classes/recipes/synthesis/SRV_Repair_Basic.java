package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Repair_Basic extends AbstractSynthesisRecipe_Basic
{
    public SRV_Repair_Basic()
    {
        super("SRV Repair [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Repair, "synthesized")
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.NICKEL, 1));
    }
}