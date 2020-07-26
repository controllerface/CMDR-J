package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PlasmaSlug extends AbstractExperimentalRecipe
{
    public PlasmaSlug()
    {
        super("Plasma Slug", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Reload_from_Ship_Fuel, 0.0),
                  new ItemEffectData(ItemEffect.Damage, -10.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, -40.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, -100.0)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4));
    }
}