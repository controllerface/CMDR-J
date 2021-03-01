package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_7D extends AbstractPowerPlant
{
    public PowerPlant_7D()
    {
        super("7D Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 105.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 22.5),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
                ));
    }

    @Override
    public long price()
    {
        return 1_899_600;
    }
}