package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PhasingSequence extends AbstractExperimentalRecipe
{
    public PhasingSequence()
    {
        super("Phasing Sequence", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Part_of_Damage_Through_Shields, 10.0),
                  new ItemEffectData(ItemEffect.Damage_Percent, -10.0)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3),
            new CostData(Material.NIOBIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3));
    }
}