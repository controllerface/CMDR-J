package com.controllerface.cmdr_j.classes.modules.core.powerplant.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_8E extends AbstractPowerPlant
{
    public PowerPlant_8E()
    {
        super("8E Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 135.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 24.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
            ));
    }
}