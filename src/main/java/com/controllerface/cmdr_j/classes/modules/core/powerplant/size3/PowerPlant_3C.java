package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_3C extends AbstractPowerPlant
{
    public PowerPlant_3C()
    {
        super("3C Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.5),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 10.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}