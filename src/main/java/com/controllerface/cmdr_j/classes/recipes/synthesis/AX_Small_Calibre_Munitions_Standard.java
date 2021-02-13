package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Small_Calibre_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public AX_Small_Calibre_Munitions_Standard()
    {
        super("AX Small Calibre Munitions [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                  new ItemEffectData(ItemEffect.Damage_Boost, 5.0)
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.PHOSPHORUS, 2),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.UNKNOWNENERGYSOURCE, 3),
            new CostData(Material.TG_WEAPONPARTS, 4));
    }
}