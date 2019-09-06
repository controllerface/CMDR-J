package com.controllerface.cmdr_j.classes.modules.core.powerplant.size4;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_4B extends AbstractPowerPlant
{
    public PowerPlant_4B()
    {
        super("4B Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 14.3),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
            ));
    }
}