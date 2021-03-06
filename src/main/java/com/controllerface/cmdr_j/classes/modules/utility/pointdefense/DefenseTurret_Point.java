package com.controllerface.cmdr_j.classes.modules.utility.pointdefense;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DefenseTurret_Point extends AbstractPointDefense
{
    public DefenseTurret_Point()
    {
        super("0I Point Defense Turret",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "I"),
                        new ItemEffectData(ItemEffect.Mass, 0.5),
                        new ItemEffectData(ItemEffect.Integrity, 30.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 2.0),
                        new ItemEffectData(ItemEffect.Damage, 0.2),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.07),
                        new ItemEffectData(ItemEffect.MaximumRange, 2500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 15.0),
                        new ItemEffectData(ItemEffect.BurstSize, 4.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 10000.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 0.4),
                        new ItemEffectData(ItemEffect.Jitter, 0.75),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 18_550;
    }
}