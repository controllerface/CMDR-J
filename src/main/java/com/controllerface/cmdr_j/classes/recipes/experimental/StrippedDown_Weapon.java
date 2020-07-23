package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class StrippedDown_Weapon extends AbstractExperimentalRecipe
{
    public StrippedDown_Weapon()
    {
        super("Stripped Down", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, -10.0)
            ),
            new CostData(Material.SALVAGEDALLOYS, 5),
            new CostData(Material.CARBON, 5),
            new CostData(Material.TIN, 1));
    }
}