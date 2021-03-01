package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AngledPlating_HullReinforcement extends AbstractExperimentalRecipe
{
    public AngledPlating_HullReinforcement()
    {
        super("Angled Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -5.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 2.0)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.CARBON, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3));
    }
}