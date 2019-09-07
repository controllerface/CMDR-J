package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Large_Calibre_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Large_Calibre_Munitions_Basic()
    {
        super("Large Calibre Munitions Basic", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0)
            ),
            new CostData(Material.NICKEL, 4),
            new CostData(Material.CARBON, 3),
            new CostData(Material.SULPHUR, 2));
    }
}