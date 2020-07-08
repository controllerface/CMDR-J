package com.controllerface.cmdr_j.classes.modules.core.thrusters.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_5A extends AbstractThrusters
{
    public Thrusters_5A()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 5.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 20.0),
                new ItemEffectData(ItemEffect.Integrity, 106.0),
                new ItemEffectData(ItemEffect.PowerDraw, 6.12),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 420.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 840.0),
                new ItemEffectData(ItemEffect.MaximumMass, 1260.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 5_103_950;
    }
}