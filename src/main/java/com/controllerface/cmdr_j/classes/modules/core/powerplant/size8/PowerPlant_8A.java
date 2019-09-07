package com.controllerface.cmdr_j.classes.modules.core.powerplant.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_8A extends AbstractPowerPlant
{
    public PowerPlant_8A()
    {
        super("8A Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 165.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 36.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
            ));
    }
}