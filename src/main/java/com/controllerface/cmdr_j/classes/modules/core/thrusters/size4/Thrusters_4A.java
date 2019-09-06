package com.controllerface.cmdr_j.classes.modules.core.thrusters.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Thrusters_4A extends AbstractThrusters
{
    public Thrusters_4A()
    {
        super("4A Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 88.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 4.92),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 210.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 420.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 630.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 96.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 116.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}