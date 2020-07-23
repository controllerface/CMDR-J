package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SuperPenetrator_Legacy extends AbstractExperimentalRecipe
{
    public SuperPenetrator_Legacy()
    {
        super("Super Penetrator (Legacy)", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Module_Damage, 0.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 50.0)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5));
    }
}