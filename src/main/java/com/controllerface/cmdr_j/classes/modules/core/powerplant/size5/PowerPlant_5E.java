package com.controllerface.cmdr_j.classes.modules.core.powerplant.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_5E extends AbstractPowerPlant
{
    public PowerPlant_5E()
    {
        super("5E Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 86.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 13.6),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
                ));
    }

    @Override
    public long price()
    {
        return 63_010;
    }
}