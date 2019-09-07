package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class High_Velocity_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public High_Velocity_Munitions_Basic()
    {
        super("High Velocity Munitions Basic", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0)
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.VANADIUM, 1));
    }
}