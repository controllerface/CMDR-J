package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2D extends AbstractThrusters
{
    public Thrusters_2D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 1.0),
                new ItemEffectData(ItemEffect.Integrity, 41.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.25),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 27.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 54.0),
                new ItemEffectData(ItemEffect.MaximumMass, 81.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 5_930;
    }
}