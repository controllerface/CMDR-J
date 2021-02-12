package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PlasmaSlugCooled extends AbstractExperimentalRecipe
{
    public PlasmaSlugCooled()
    {
        super("Plasma Slug", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Reload_from_Ship_Fuel, "Installed"),
                  new ItemEffectData(ItemEffect.Damage_Percent, -10.0),
                  new ItemEffectData(ItemEffect.ThermalLoad_Percent, -40.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum_Percent, -100.0)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4));
    }
}