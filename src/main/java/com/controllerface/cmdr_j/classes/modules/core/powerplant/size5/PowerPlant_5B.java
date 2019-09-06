package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_5B extends AbstractPowerPlant
{
    public PowerPlant_5B()
    {
        super("5B Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 115.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 18.7),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
            ));
    }
}