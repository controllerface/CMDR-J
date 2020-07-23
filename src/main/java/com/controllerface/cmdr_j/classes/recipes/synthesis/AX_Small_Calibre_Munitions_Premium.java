package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Small_Calibre_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public AX_Small_Calibre_Munitions_Premium()
    {
        super("AX Small Calibre Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 10.0)
            ),
            new CostData(Material.IRON, 3),
            new CostData(Material.PHOSPHORUS, 2),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.UNKNOWNENERGYSOURCE, 4),
            new CostData(Material.UNKNOWNCARAPACE, 2),
            new CostData(Material.TG_WEAPONPARTS, 6));
    }
}