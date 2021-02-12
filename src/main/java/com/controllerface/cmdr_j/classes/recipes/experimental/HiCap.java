package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HiCap extends AbstractExperimentalRecipe
{
    public HiCap()
    {
        super("Hi-Cap", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.PowerDraw_Percent, 10.0),
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 6.0),
                  new ItemEffectData(ItemEffect.DistributorDraw_Percent, 25.0)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1));
    }
}