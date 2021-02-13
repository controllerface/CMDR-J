package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Explosives_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Explosives_Munitions_Basic()
    {
        super("Explosives Munitions [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized")
            ),
            new CostData(Material.IRON, 3),
            new CostData(Material.NICKEL, 3),
            new CostData(Material.CARBON, 4),
            new CostData(Material.SULPHUR, 4));
    }
}