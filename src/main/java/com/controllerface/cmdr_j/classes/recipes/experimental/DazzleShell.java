package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DazzleShell extends AbstractExperimentalRecipe
{
    public DazzleShell()
    {
        super("Dazzle Shell", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Sensor_Acuity_Reduced, "Installed")
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MANGANESE, 4),
            new CostData(Material.HYBRIDCAPACITORS, 5));
    }
}