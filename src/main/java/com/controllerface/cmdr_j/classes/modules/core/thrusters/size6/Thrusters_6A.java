package com.controllerface.cmdr_j.classes.modules.core.thrusters.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_6A extends AbstractThrusters
{
    public Thrusters_6A()
    {
        super("6A Thrusters",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 124.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 7.56),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 720.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 1440.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 2160.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }

    @Override
    public long price()
    {
        return 16_179_530;
    }
}