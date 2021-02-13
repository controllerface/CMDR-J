package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Limpets extends AbstractSynthesisRecipe_Basic
{
    public Limpets()
    {
        super("Limpets", 
            new ItemEffects(
                new ItemEffectData(ItemEffect.Refill, "synthesized"),
                new ItemEffectData(ItemEffect.Limpet_Restock, 4)
            ),
            new CostData(Material.IRON, 10),
            new CostData(Material.NICKEL, 10));
    }
}