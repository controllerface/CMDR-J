package com.controllerface.cmdr_j.classes.modules.core.thrusters.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class Thrusters_5C extends AbstractThrusters
{
    public Thrusters_5C()
    {
        super("5C Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 5.1),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 350.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 700.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 1050.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}