package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Refuel_Premium extends AbstractSynthesisRecipe_Premium
{
    public SRV_Refuel_Premium()
    {
        super("SRV Refuel Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refuel, 0.0),
                  new ItemEffectData(ItemEffect.Fuel_Efficiency, 200.0)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TECHNETIUM, 1));
    }
}