package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SuperPenetrator extends AbstractExperimentalRecipe
{
    public SuperPenetrator()
    {
        super("Super Penetrator", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Module_Damage, "Installed"),
                  new ItemEffectData(ItemEffect.ReloadTime_Percent, 50.0),
                  new ItemEffectData(ItemEffect.ThermalLoad_Percent, -40.0)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5));
    }
}