package com.controllerface.cmdr_j.classes.modules.core.powerplant.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_4C extends AbstractPowerPlant
{
    public PowerPlant_4C()
    {
        super("4C Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 5.0),
                        new ItemEffectData(ItemEffect.Integrity, 80.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 13.0),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 178_900;
    }
}