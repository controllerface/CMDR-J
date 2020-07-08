package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_5B extends AbstractPowerPlant
{
    public PowerPlant_5B()
    {
        super("5B Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 115.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 18.7),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
                ));
    }

    @Override
    public long price()
    {
        return 1_701_320;
    }
}