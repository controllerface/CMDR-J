package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerPlant_5E extends AbstractPowerPlant
{
    public PowerPlant_5E()
    {
        super("5E Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 86.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 13.6),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
            ));
    }
}