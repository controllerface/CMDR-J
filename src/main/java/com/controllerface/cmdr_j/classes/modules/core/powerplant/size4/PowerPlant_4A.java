package com.controllerface.cmdr_j.classes.modules.core.powerplant.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_4A extends AbstractPowerPlant
{
    public PowerPlant_4A()
    {
        super("4A Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 5.0),
                        new ItemEffectData(ItemEffect.Integrity, 88.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 15.6),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.4)
                ));
    }

    @Override
    public long price()
    {
        return 1_610_080;
    }
}