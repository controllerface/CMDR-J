package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2C extends AbstractThrusters
{
    public Thrusters_2C()
    {
        super("2C Standard Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.5),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 30.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 60.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 90.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 17_800;
    }
}