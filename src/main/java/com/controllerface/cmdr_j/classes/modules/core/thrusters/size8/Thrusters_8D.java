package com.controllerface.cmdr_j.classes.modules.core.thrusters.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_8D extends AbstractThrusters
{
    public Thrusters_8D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 8.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 64.0),
                new ItemEffectData(ItemEffect.Integrity, 120.0),
                new ItemEffectData(ItemEffect.PowerDraw, 8.1),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 1260.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 2520.0),
                new ItemEffectData(ItemEffect.MaximumMass, 3780.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 6_021_720;
    }
}