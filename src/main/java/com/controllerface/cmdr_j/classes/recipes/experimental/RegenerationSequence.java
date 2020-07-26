package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RegenerationSequence extends AbstractExperimentalRecipe
{
    public RegenerationSequence()
    {
        super("Regeneration Sequence", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Wing_Shield_Regeneration, 0.0),
                  new ItemEffectData(ItemEffect.Damage, -10.0)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDINGSENSORS, 4),
            new CostData(Material.SHIELDFREQUENCYDATA, 1));
    }
}