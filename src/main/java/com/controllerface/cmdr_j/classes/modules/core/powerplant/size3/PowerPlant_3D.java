package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_3D extends AbstractPowerPlant
{
    public PowerPlant_3D()
    {
        super("3D Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 9.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
            ));
    }
}