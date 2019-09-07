package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Remote_Flak_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public AX_Remote_Flak_Munitions_Standard()
    {
        super("AX Remote Flak Munitions Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 5.0)
            ),
            new CostData(Material.TIN, 2),
            new CostData(Material.ZINC, 3),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.UNKNOWNTECHNOLOGYCOMPONENTS, 3),
            new CostData(Material.TG_WRECKAGECOMPONENTS, 2));
    }
}