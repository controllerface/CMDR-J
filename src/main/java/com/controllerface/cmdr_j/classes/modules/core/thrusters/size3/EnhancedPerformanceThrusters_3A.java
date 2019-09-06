package com.controllerface.cmdr_j.classes.modules.core.thrusters.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class EnhancedPerformanceThrusters_3A extends AbstractThrusters
{
    public EnhancedPerformanceThrusters_3A()
    {
        super("3A Enhanced Performance Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 55.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 5.0),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 70.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 90.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 200.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 115.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 136.67),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}