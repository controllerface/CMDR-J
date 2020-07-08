package com.controllerface.cmdr_j.classes.modules.core.thrusters.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_3E extends AbstractThrusters
{
    public Thrusters_3E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 5.0),
                new ItemEffectData(ItemEffect.Integrity, 58.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.48),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 40.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 80.0),
                new ItemEffectData(ItemEffect.MaximumMass, 120.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 6_270;
    }
}