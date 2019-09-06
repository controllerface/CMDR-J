package com.controllerface.cmdr_j.classes.modules.core.thrusters.size4;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;

public class Thrusters_4B extends AbstractThrusters
{
    public Thrusters_4B()
    {
        super("4B Standard Thrusters", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 4.51),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.EngineMinimumMass, 193.0),
                  new ItemEffectData(ItemEffect.EngineOptimalMass, 385.0),
                  new ItemEffectData(ItemEffect.MaximumMass, 578.0),
                  new ItemEffectData(ItemEffect.EngineMinPerformance, 93.0),
                  new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                  new ItemEffectData(ItemEffect.EngineMaxPerformance, 113.0),
                  new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
            ));
    }
}