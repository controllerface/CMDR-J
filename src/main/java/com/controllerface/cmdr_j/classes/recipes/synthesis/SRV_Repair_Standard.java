package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Repair_Standard extends AbstractSynthesisRecipe_Standard
{
    public SRV_Repair_Standard()
    {
        super("SRV Repair [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Repair, "synthesized"),
                  new ItemEffectData(ItemEffect.Hull_Strength, 50.0)
            ),
            new CostData(Material.NICKEL, 3),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.MOLYBDENUM, 1));
    }
}