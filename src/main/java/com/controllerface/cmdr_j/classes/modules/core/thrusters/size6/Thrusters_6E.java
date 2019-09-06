package com.controllerface.cmdr_j.classes.modules.core.thrusters.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class Thrusters_6E extends AbstractThrusters
{
    public Thrusters_6E()
    {
        super("6E Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 102.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 5.04),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 480.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 960.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 1440.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}