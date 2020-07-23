package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DragMunitions extends AbstractExperimentalRecipe
{
    public DragMunitions()
    {
        super("Drag Munitions", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Speed_Reduced, 0.0)
            ),
            new CostData(Material.CARBON, 5),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.MOLYBDENUM, 2));
    }
}