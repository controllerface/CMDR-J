package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FeedbackCascade extends AbstractExperimentalRecipe
{
    public FeedbackCascade()
    {
        super("Feedback Cascade", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Shield_Cell_Disrupted, "Installed"),
                  new ItemEffectData(ItemEffect.Damage, -20.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, -40.0)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5));
    }
}