package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class EmissiveMunitions extends AbstractExperimentalRecipe
{
    public EmissiveMunitions()
    {
        super("Emissive Munitions", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Signature_Increased, "Installed"),
                  new ItemEffectData(ItemEffect.ThermalLoad, 100.0)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.EMISSIONDATA, 3),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.MANGANESE, 1));
    }
}