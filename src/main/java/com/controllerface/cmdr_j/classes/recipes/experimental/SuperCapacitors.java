package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SuperCapacitors extends AbstractExperimentalRecipe
{
    public SuperCapacitors()
    {
        super("Super Capacitors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 5.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -2.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -2.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -2.0)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.CADMIUM, 2));
    }
}