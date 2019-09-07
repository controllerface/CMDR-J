package com.controllerface.cmdr_j.classes.modules.core.thrusters.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_6D extends AbstractThrusters
{
    public Thrusters_6D()
    {
        super("6D Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 5.67),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 540.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 1080.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 1620.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 86.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 106.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}