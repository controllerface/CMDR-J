package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Small_Calibre_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Small_Calibre_Munitions_Premium()
    {
        super("Small Calibre Munitions [Premium]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.SULPHUR, 2),
            new CostData(Material.PHOSPHORUS, 2),
            new CostData(Material.TUNGSTEN, 2),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.MERCURY, 2),
            new CostData(Material.ANTIMONY, 1));
    }
}