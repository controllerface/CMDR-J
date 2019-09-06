package com.controllerface.cmdr_j.classes.modules.core.thrusters.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Thrusters_7B extends AbstractThrusters
{
    public Thrusters_7B()
    {
        super("7B Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 126.0),
                  new ItemEffectData(ItemEffect.Integrity, 157.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 8.36),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 990.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 1980.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 2970.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 93.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}