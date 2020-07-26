package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Remote_Flak_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public AX_Remote_Flak_Munitions_Premium()
    {
        super("AX Remote Flak Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 10.0)
            ),
            new CostData(Material.ZINC, 8),
            new CostData(Material.TUNGSTEN, 2),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.UNKNOWNENERGYSOURCE, 3),
            new CostData(Material.UNKNOWNTECHNOLOGYCOMPONENTS, 4),
            new CostData(Material.TG_WEAPONPARTS, 1));
    }
}