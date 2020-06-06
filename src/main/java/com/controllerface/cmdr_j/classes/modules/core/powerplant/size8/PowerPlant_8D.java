package com.controllerface.cmdr_j.classes.modules.core.powerplant.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_8D extends AbstractPowerPlant
{
    public PowerPlant_8D()
    {
        super("8D Power Plant",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 120.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 27.0),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
            ));
    }

    @Override
    public long price()
    {
        return 6_021_720;
    }
}