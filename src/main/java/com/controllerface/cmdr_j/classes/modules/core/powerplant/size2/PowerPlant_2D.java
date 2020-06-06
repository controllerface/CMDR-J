package com.controllerface.cmdr_j.classes.modules.core.powerplant.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_2D extends AbstractPowerPlant
{
    public PowerPlant_2D()
    {
        super("2D Power Plant",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.0),
                  new ItemEffectData(ItemEffect.Integrity, 41.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 7.2),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.75)
            ));
    }

    @Override
    public long price()
    {
        return 5_930;
    }
}