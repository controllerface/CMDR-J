package com.controllerface.cmdr_j.classes.modules.core.powerplant.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHybridPowerPlant_2A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_2A()
    {
        super("Hybrid Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 1.5),
                        new ItemEffectData(ItemEffect.Integrity, 56.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 12.7),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 113_400;
    }
}