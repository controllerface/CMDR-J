package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_7B extends AbstractPowerPlant
{
    public PowerPlant_7B()
    {
        super("7B Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 157.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 27.5),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
            ));
    }
}