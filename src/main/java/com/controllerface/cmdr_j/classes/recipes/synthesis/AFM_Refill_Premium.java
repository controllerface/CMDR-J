package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFM_Refill_Premium extends AbstractSynthesisRecipe_Premium
{
    public AFM_Refill_Premium()
    {
        super("AFM Refill Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, 0.0),
                  new ItemEffectData(ItemEffect.Repair_Speed, 100.0)
            ),
            new CostData(Material.ZINC, 2),
            new CostData(Material.CHROMIUM, 4),
            new CostData(Material.VANADIUM, 6),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.TELLURIUM, 1),
            new CostData(Material.RUTHENIUM, 1));
    }
}