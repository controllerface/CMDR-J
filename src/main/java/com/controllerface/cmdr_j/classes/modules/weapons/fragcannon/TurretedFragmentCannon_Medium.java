package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedFragmentCannon_Medium extends AbstractFragCannon
{
    public TurretedFragmentCannon_Medium()
    {
        super("2D Turreted Fragment Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.79),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 87.13),
                        new ItemEffectData(ItemEffect.Damage, 1.67),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.21),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.41),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 30.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 4.348),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                        new ItemEffectData(ItemEffect.BurstSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.5),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.Jitter, 5.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1800.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_459_200;
    }
}