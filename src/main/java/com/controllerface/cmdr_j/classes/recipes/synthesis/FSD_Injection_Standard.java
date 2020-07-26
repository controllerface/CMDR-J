package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSD_Injection_Standard extends AbstractSynthesisRecipe_Standard
{
    public FSD_Injection_Standard()
    {
        super("FSD Injection Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 50.0)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.NIOBIUM, 1));
    }
}