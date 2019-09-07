package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFM_Refill_Standard extends AbstractSynthesisRecipe_Standard
{
    public AFM_Refill_Standard()
    {
        super("AFM Refill Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, 0.0),
                  new ItemEffectData(ItemEffect.Repair_Speed, 50.0)
            ),
            new CostData(Material.TIN, 1),
            new CostData(Material.MANGANESE, 2),
            new CostData(Material.VANADIUM, 6),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.ZIRCONIUM, 1));
    }
}