package com.controllerface.cmdr_j.classes.modules.core.thrusters.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_7C extends AbstractThrusters
{
    public Thrusters_7C()
    {
        super("7C Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 131.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 7.6),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 900.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 1800.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 2700.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 5_698_790;
    }
}