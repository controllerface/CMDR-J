package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Refuel_Standard extends AbstractSynthesisRecipe_Standard
{
    public SRV_Refuel_Standard()
    {
        super("SRV Refuel Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refuel, 0.0),
                  new ItemEffectData(ItemEffect.Fuel_Efficiency, 100.0)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.MERCURY, 1));
    }
}