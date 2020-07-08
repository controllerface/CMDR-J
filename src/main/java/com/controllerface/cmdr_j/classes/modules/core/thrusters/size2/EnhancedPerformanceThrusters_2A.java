package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class EnhancedPerformanceThrusters_2A extends AbstractThrusters
{
    public EnhancedPerformanceThrusters_2A()
    {
        super("Enhanced Performance Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 4.0),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 50.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 60.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 120.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 115.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 136.67),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 2.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_610_080;
    }
}