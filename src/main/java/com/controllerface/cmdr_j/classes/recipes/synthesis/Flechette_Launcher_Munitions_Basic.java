package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Flechette_Launcher_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Flechette_Launcher_Munitions_Basic()
    {
        super("Flechette Launcher Munitions Basic", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3),
            new CostData(Material.MECHANICALCOMPONENTS, 2),
            new CostData(Material.BORON, 2));
    }
}