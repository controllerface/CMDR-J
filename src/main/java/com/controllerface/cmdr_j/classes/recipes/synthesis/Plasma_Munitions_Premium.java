package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Plasma_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Plasma_Munitions_Premium()
    {
        super("Plasma Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.SELENIUM, 5),
            new CostData(Material.CADMIUM, 4),
            new CostData(Material.MOLYBDENUM, 4),
            new CostData(Material.TECHNETIUM, 2));
    }
}