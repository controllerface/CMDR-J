package com.controllerface.cmdr_j.classes.modules.core.thrusters.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_3A extends AbstractThrusters
{
    public Thrusters_3A()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 5.0),
                new ItemEffectData(ItemEffect.Integrity, 70.0),
                new ItemEffectData(ItemEffect.PowerDraw, 3.72),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 60.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 120.0),
                new ItemEffectData(ItemEffect.MaximumMass, 180.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 16.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 507_910;
    }
}