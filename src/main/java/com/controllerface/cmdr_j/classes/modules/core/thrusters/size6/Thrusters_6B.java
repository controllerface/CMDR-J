package com.controllerface.cmdr_j.classes.modules.core.thrusters.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_6B extends AbstractThrusters
{
    public Thrusters_6B()
    {
        super("6B Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Mass, 64.0),
                        new ItemEffectData(ItemEffect.Integrity, 136.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 6.93),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 660.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 1320.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 1980.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 93.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 5_393_180;
    }
}