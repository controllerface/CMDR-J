package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MultiWeave extends AbstractExperimentalRecipe
{
    public MultiWeave()
    {
        super("Multi-Weave", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.PowerDraw, 10.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 25.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 3.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 3.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 3.0)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1));
    }
}