package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FastCharge extends AbstractExperimentalRecipe
{
    public FastCharge()
    {
        super("Fast Charge", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.RegenRate, 15.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 15.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -1.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -1.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -1.0)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.COMPOUNDSHIELDING, 1));
    }
}