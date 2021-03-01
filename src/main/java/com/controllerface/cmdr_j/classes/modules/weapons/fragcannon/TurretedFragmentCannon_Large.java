package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedFragmentCannon_Large extends AbstractFragCannon
{
    public TurretedFragmentCannon_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.229),
                new ItemEffectData(ItemEffect.DamagePerSecond, 143.28),
                new ItemEffectData(ItemEffect.Damage, 2.985),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.37),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.74),
                new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                new ItemEffectData(ItemEffect.RateOfFire, 4.0),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                new ItemEffectData(ItemEffect.BurstSize, 1.0),
                new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                new ItemEffectData(ItemEffect.BreachDamage, 2.7),
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
        return 5_836_800;
    }
}