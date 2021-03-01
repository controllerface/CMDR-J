package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AX_Small_Calibre_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public AX_Small_Calibre_Munitions_Basic()
    {
        super("AX Small Calibre Munitions [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized")
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.TG_WEAPONPARTS, 2));
    }
}