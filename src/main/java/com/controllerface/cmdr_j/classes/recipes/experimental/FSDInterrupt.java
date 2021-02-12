package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterrupt extends AbstractExperimentalRecipe
{
    public FSDInterrupt()
    {
        super("FSD Interrupt", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_FSD_Reboot, "Installed"),
                  new ItemEffectData(ItemEffect.Damage, -30.0),
                  new ItemEffectData(ItemEffect.RateOfFire, -50.0)
            ),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.FSDTELEMETRY, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3));
    }
}