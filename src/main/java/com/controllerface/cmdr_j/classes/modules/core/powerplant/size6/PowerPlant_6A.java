package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_6A extends AbstractPowerPlant
{
    public PowerPlant_6A()
    {
        super("6A Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 124.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 25.2),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
            ));
    }
}