package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Explosive_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public AX_Explosive_Munitions_Premium()
    {
        super("AX Explosive Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 10.0)
            ),
            new CostData(Material.TUNGSTEN, 5),
            new CostData(Material.MERCURY, 4),
            new CostData(Material.POLONIUM, 2),
            new CostData(Material.TG_BIOMECHANICALCONDUITS, 5),
            new CostData(Material.TG_PROPULSIONELEMENT, 5),
            new CostData(Material.TG_SHIPFLIGHTDATA, 6));
    }
}