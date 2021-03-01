package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHybridPowerPlant_3A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_3A()
    {
        super("Hybrid Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.9),
                        new ItemEffectData(ItemEffect.Integrity, 70.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 15.8),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 204_120;
    }
}