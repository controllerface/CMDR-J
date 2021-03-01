package com.controllerface.cmdr_j.classes.modules.core.thrusters.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Thrusters_4C extends AbstractThrusters
{
    public Thrusters_4C()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 4.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 10.0),
                new ItemEffectData(ItemEffect.Integrity, 80.0),
                new ItemEffectData(ItemEffect.PowerDraw, 4.1),
                new ItemEffectData(ItemEffect.BootTime, 0.0),
                new ItemEffectData(ItemEffect.EngineMinimumMass, 175.0),
                new ItemEffectData(ItemEffect.EngineOptimalMass, 350.0),
                new ItemEffectData(ItemEffect.MaximumMass, 525.0),
                new ItemEffectData(ItemEffect.EngineMinPerformance, 90.0),
                new ItemEffectData(ItemEffect.EngineOptPerformance, 100.0),
                new ItemEffectData(ItemEffect.EngineMaxPerformance, 110.0),
                new ItemEffectData(ItemEffect.EngineHeatRate, 1.3)
        ));
    }

    @Override
    public long price()
    {
        return 178_900;
    }
}