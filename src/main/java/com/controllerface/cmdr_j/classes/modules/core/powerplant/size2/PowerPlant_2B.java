package com.controllerface.cmdr_j.classes.modules.core.powerplant.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_2B extends AbstractPowerPlant
{
    public PowerPlant_2B()
    {
        super("2B Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 61.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 8.8),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
                ));
    }

    @Override
    public long price()
    {
        return 53_410;
    }
}