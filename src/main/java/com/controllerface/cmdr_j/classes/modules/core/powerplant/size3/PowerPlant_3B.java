package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_3B extends AbstractPowerPlant
{
    public PowerPlant_3B()
    {
        super("3B Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 77.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 11.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
            ));
    }
}