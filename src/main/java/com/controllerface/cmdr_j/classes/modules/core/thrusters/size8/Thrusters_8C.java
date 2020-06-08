package com.controllerface.cmdr_j.classes.modules.core.thrusters.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_8C extends AbstractThrusters
{
    public Thrusters_8C()
    {
        super("8C Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 150.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 9.0),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 1400.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 2800.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 4200.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 18_065_170;
    }
}