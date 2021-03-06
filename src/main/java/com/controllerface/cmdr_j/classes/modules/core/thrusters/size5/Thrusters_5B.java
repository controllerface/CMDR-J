package com.controllerface.cmdr_j.classes.modules.core.thrusters.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_5B extends AbstractThrusters
{
    public Thrusters_5B()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 5.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 32.0),
                new ItemEffectData(ItemEffect.Integrity, 115.0),
                new ItemEffectData(ItemEffect.PowerDraw, 5.61),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 385.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 770.0),
                new ItemEffectData(ItemEffect.MaximumMass, 1155.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 93.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 1_701_320;
    }
}