package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Flechette_Launcher_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Flechette_Launcher_Munitions_Premium()
    {
        super("Flechette Launcher Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 10.0)
            ),
            new CostData(Material.TUNGSTEN, 6),
            new CostData(Material.ELECTROCHEMICALARRAYS, 9),
            new CostData(Material.MECHANICALCOMPONENTS, 5),
            new CostData(Material.BORON, 6));
    }
}