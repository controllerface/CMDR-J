package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AngledPlating_Armour extends AbstractExperimentalRecipe
{
    public AngledPlating_Armour()
    {
        super("Angled Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 8.0)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.ZIRCONIUM, 3));
    }
}