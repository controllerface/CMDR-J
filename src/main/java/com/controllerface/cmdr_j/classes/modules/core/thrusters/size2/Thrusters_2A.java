package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2A extends AbstractThrusters
{
    public Thrusters_2A()
    {
        super("2A Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.5),
                  new ItemEffectData(ItemEffect.Integrity, 56.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 3.0),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 36.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 72.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 108.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}