package com.controllerface.cmdr_j.classes.modules.utility.heatsinklauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Launcher_HeatSink extends AbstractHeatsinkLauncher
{
    public Launcher_HeatSink()
    {
        super("0I Heat-Sink Launcher",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "I"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 20.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.DistributorDraw, 2.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.2),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 10.0),
                        new ItemEffectData(ItemEffect.HeatSinkDuration, 10.0),
                        new ItemEffectData(ItemEffect.ThermalDrain, 100.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_500;
    }
}