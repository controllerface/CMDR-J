package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_3A extends AbstractPowerPlant
{
    public PowerPlant_3A()
    {
        super("3A Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 70.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 12.0),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
                ));
    }

    @Override
    public long price()
    {
        return 507_910;
    }
}