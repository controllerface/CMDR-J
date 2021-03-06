package com.controllerface.cmdr_j.classes.modules.core.thrusters.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_5E extends AbstractThrusters
{
    public Thrusters_5E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 5.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 20.0),
                new ItemEffectData(ItemEffect.Integrity, 86.0),
                new ItemEffectData(ItemEffect.PowerDraw, 4.08),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 280.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 560.0),
                new ItemEffectData(ItemEffect.MaximumMass, 840.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 83.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 103.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 63_010;
    }
}
