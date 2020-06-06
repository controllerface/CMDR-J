package com.controllerface.cmdr_j.classes.modules.core.thrusters.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_8E extends AbstractThrusters
{
    public Thrusters_8E()
    {
        super("8E Thrusters",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 135.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 7.2),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 1120.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 2240.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 3360.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }

    @Override
    public long price()
    {
        return 2_007_240;
    }
}