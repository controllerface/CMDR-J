package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_5D extends AbstractPowerPlant
{
    public PowerPlant_5D()
    {
        super("5D Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 77.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 15.3),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
                ));
    }

    @Override
    public long price()
    {
        return 189_040;
    }
}