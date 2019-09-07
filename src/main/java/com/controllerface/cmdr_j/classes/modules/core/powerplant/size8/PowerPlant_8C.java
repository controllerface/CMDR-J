package com.controllerface.cmdr_j.classes.modules.core.powerplant.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_8C extends AbstractPowerPlant
{
    public PowerPlant_8C()
    {
        super("8C Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 150.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 30.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}