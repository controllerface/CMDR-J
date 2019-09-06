package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;

public class PowerPlant_3A extends AbstractPowerPlant
{
    public PowerPlant_3A()
    {
        super("3A Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.5),
                  new ItemEffectData(ItemEffect.Integrity, 70.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 12.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
            ));
    }
}