package com.controllerface.cmdr_j.classes.modules.core.thrusters.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_8B extends AbstractThrusters
{
    public Thrusters_8B()
    {
        super("8B Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Mass, 256.0),
                        new ItemEffectData(ItemEffect.Integrity, 180.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 9.9),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 1540.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 3080.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 4620.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 93.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 54_195_500;
    }
}