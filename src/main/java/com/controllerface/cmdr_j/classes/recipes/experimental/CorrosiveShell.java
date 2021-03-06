package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CorrosiveShell extends AbstractExperimentalRecipe
{
    public CorrosiveShell()
    {
        super("Corrosive Shell", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Armor_Hardness_Reduced, "Installed"),
                  new ItemEffectData(ItemEffect.AmmoMaximum_Percent, -20.0)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.PRECIPITATEDALLOYS, 4),
            new CostData(Material.ARSENIC, 3));
    }
}