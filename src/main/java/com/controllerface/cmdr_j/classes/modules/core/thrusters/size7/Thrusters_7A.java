package com.controllerface.cmdr_j.classes.modules.core.thrusters.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_7A extends AbstractThrusters
{
    public Thrusters_7A()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 80.0),
                new ItemEffectData(ItemEffect.Integrity, 144.0),
                new ItemEffectData(ItemEffect.PowerDraw, 9.12),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 1080.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 2160.0),
                new ItemEffectData(ItemEffect.MaximumMass, 3240.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 51_289_110;
    }
}