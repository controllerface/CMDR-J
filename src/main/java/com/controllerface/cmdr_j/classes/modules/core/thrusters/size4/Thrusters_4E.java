package com.controllerface.cmdr_j.classes.modules.core.thrusters.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_4E extends AbstractThrusters
{
    public Thrusters_4E()
    {
        super("4E Standard Thrusters",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 10.0),
                        new ItemEffectData(ItemEffect.Integrity, 72.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.28),
                        new ItemEffectData(ItemEffect.BootTime, 0.0),
                        new ItemEffectData(ItemEffect.EngineMinimumMass, 140.0),
                        new ItemEffectData(ItemEffect.EngineOptimalMass, 280.0),
                        new ItemEffectData(ItemEffect.MaximumMass, 420.0),
                        new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                        new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                        new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                        new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
                ));
    }

    @Override
    public long price()
    {
        return 19_880;
    }
}