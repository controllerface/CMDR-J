package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_5A extends AbstractPowerPlant
{
    public PowerPlant_5A()
    {
        super("5A Power Plant",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 106.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 20.4),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
            ));
    }

    @Override
    public long price()
    {
        return 5_103_950;
    }
}