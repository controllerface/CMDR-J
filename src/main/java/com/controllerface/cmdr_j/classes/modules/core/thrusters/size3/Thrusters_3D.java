package com.controllerface.cmdr_j.classes.modules.core.thrusters.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_3D extends AbstractThrusters
{
    public Thrusters_3D()
    {
        super("3D Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.79),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 45.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 90.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 135.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }

    @Override
    public long price()
    {
        return 18_810;
    }
}