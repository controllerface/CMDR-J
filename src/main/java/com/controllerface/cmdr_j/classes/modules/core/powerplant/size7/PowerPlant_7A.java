package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_7A extends AbstractPowerPlant
{
    public PowerPlant_7A()
    {
        super("7A Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 144.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 30.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
            ));
    }
}