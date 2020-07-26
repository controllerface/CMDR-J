package com.controllerface.cmdr_j.classes.modules.core.thrusters.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_7E extends AbstractThrusters
{
    public Thrusters_7E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 80.0),
                new ItemEffectData(ItemEffect.Integrity, 118.0),
                new ItemEffectData(ItemEffect.PowerDraw, 6.08),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 720.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 1440.0),
                new ItemEffectData(ItemEffect.MaximumMass, 2160.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 633_200;
    }
}