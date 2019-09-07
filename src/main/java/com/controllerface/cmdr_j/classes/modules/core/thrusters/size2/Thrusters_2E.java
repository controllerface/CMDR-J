package com.controllerface.cmdr_j.classes.modules.core.thrusters.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_2E extends AbstractThrusters
{
    public Thrusters_2E()
    {
        super("2E Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.5),
                  new ItemEffectData(ItemEffect.Integrity, 46.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.0),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 24.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 48.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 72.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}