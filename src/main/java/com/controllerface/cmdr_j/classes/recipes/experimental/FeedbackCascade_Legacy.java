package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FeedbackCascade_Legacy extends AbstractExperimentalRecipe
{
    public FeedbackCascade_Legacy()
    {
        super("Feedback Cascade (Legacy)", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Shield_Cell_Disrupted, "Installed"),
                  new ItemEffectData(ItemEffect.Damage_Percent, -20.0)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5));
    }
}