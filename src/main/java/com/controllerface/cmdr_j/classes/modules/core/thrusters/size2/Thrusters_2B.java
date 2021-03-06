package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2B extends AbstractThrusters
{
    public Thrusters_2B()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 61.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.75),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 33.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 66.0),
                new ItemEffectData(ItemEffect.MaximumMass, 99.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 53_410;
    }
}