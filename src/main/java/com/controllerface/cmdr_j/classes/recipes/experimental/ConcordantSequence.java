package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ConcordantSequence extends AbstractExperimentalRecipe
{
    public ConcordantSequence()
    {
        super("Concordant Sequence", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Wing_Shield_Regeneration_Increased, "Installed"),
                  new ItemEffectData(ItemEffect.ThermalLoad, 50.0)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.EMBEDDEDFIRMWARE, 3),
            new CostData(Material.ZIRCONIUM, 1));
    }
}