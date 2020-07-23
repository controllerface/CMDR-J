package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DoubleBraced_Powerplant extends AbstractExperimentalRecipe
{
    public DoubleBraced_Powerplant()
    {
        super("Double Braced", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Integrity, 15.0)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}