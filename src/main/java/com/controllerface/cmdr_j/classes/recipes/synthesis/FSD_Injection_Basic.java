package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSD_Injection_Basic extends AbstractSynthesisRecipe_Basic
{
    public FSD_Injection_Basic()
    {
        super("FSD Injection [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Jump_Range_Increase, 25.0)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.GERMANIUM, 1));
    }
}