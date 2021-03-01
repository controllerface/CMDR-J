package com.controllerface.cmdr_j.classes.modules.utility.chafflauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Launcher_Chaff extends AbstractChaffLauncher
{
    public Launcher_Chaff()
    {
        super("0I Chaff Launcher",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "I"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 20.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.DistributorDraw, 4.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 4.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 10.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 10.0),
                        new ItemEffectData(ItemEffect.ChaffJamDuration, 20.0)
                ));
    }

    @Override
    public long price()
    {
        return 8_500;
    }
}