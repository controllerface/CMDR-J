package com.controllerface.cmdr_j.classes.modules.core.powerplant.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_4B extends AbstractPowerPlant
{
    public PowerPlant_4B()
    {
        super("4B Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 96.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 14.3),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.45)
                ));
    }

    @Override
    public long price()
    {
        return 536_690;
    }
}