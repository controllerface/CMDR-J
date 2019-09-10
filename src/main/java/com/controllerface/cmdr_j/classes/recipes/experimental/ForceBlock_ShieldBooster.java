package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ForceBlock_ShieldBooster extends AbstractExperimentalRecipe
{
    public ForceBlock_ShieldBooster()
    {
        super("Force Block", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -1.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 2.0)
            ),
            new CostData(Material.SCANARCHIVES, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2));
    }
}