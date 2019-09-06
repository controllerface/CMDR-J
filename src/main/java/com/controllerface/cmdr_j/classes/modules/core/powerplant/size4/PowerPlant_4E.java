package com.controllerface.cmdr_j.classes.modules.core.powerplant.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerPlant_4E extends AbstractPowerPlant
{
    public PowerPlant_4E()
    {
        super("4E Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 72.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 10.4),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
            ));
    }
}