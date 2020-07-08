package com.controllerface.cmdr_j.classes.modules.core.thrusters.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_5D extends AbstractThrusters
{
    public Thrusters_5D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 5.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 77.0),
                new ItemEffectData(ItemEffect.PowerDraw, 4.59),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 315.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 630.0),
                new ItemEffectData(ItemEffect.MaximumMass, 945.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 189_040;
    }
}