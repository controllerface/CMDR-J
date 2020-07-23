package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LoDraw extends AbstractExperimentalRecipe
{
    public LoDraw()
    {
        super("Lo-Draw", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.PowerDraw, -20.0),
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -2.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, -20.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -1.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -1.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -1.0)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1));
    }
}