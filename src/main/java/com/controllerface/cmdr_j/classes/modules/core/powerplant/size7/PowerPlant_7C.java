package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_7C extends AbstractPowerPlant
{
    public PowerPlant_7C()
    {
        super("7C Standard Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 131.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 25.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }

    public long price()
    {
        return 5_698_790;
    }
}