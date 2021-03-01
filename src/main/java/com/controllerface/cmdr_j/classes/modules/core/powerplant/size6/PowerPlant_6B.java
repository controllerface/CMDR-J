package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_6B extends AbstractPowerPlant
{
    public PowerPlant_6B()
    {
        super("6B Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 136.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 23.1),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
                ));
    }

    @Override
    public long price()
    {
        return 5_393_180;
    }
}