package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2A extends AbstractThrusters
{
    public Thrusters_2A()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 2.5),
                new ItemEffectData(ItemEffect.Integrity, 56.0),
                new ItemEffectData(ItemEffect.PowerDraw, 3.0),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 36.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 72.0),
                new ItemEffectData(ItemEffect.MaximumMass, 108.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 160_220;
    }
}