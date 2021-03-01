package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Repair_Premium extends AbstractSynthesisRecipe_Premium
{
    public SRV_Repair_Premium()
    {
        super("SRV Repair [Premium]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Repair, "synthesized"),
                  new ItemEffectData(ItemEffect.Hull_Strength, 100.0)
            ),
            new CostData(Material.ZINC, 1),
            new CostData(Material.CHROMIUM, 2),
            new CostData(Material.VANADIUM, 2),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.TELLURIUM, 1));
    }
}