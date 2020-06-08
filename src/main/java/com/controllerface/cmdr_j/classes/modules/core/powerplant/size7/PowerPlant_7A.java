package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_7A extends AbstractPowerPlant
{
    public PowerPlant_7A()
    {
        super("7A Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 144.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 30.0),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
                ));
    }

    @Override
    public long price()
    {
        return 51_289_110;
    }
}