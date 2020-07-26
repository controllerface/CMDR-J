package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_6A extends AbstractPowerPlant
{
    public PowerPlant_6A()
    {
        super("6A Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 124.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 25.2),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
                ));
    }

    @Override
    public long price()
    {
        return 16_179_530;
    }
}