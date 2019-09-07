package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_7E extends AbstractPowerPlant
{
    public PowerPlant_7E()
    {
        super("7E Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 118.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 20.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
            ));
    }
}