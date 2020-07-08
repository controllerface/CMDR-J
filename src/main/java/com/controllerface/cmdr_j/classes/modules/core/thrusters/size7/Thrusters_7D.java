package com.controllerface.cmdr_j.classes.modules.core.thrusters.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_7D extends AbstractThrusters
{
    public Thrusters_7D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 32.0),
                new ItemEffectData(ItemEffect.Integrity, 105.0),
                new ItemEffectData(ItemEffect.PowerDraw, 6.84),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 810.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 1620.0),
                new ItemEffectData(ItemEffect.MaximumMass, 2430.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 1_899_600;
    }
}