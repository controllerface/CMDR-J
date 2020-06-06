package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedCannon_Medium extends AbstractCannon
{
    public GimballedCannon_Medium()
    {
        super("2D Gimballed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.54),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 12.274),
                        new ItemEffectData(ItemEffect.Damage, 25.53),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.75),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.92),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 875.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4808),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 24.3),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 3500.0)
            ));
    }

    @Override
    public long price()
    {
        return 337_600;
    }
}