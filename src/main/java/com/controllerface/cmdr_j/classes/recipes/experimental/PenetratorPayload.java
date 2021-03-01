package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PenetratorPayload extends AbstractExperimentalRecipe
{
    public PenetratorPayload()
    {
        super("Penetrator Payload", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Module_Damage, "Installed")
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.SELENIUM, 3));
    }
}