package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AutoLoader extends AbstractExperimentalRecipe
{
    public AutoLoader()
    {
        super("Auto Loader", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Auto_Reload_While_Firing, "Installed")
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 4),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 4));
    }
}