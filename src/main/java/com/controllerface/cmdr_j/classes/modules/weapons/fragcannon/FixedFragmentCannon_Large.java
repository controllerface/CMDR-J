package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedFragmentCannon_Large extends AbstractFragCannon
{
    public FixedFragmentCannon_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.02),
                new ItemEffectData(ItemEffect.DamagePerSecond, 249.3),
                new ItemEffectData(ItemEffect.Damage, 4.57),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.57),
                new ItemEffectData(ItemEffect.ThermalLoad, 1.13),
                new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                new ItemEffectData(ItemEffect.RateOfFire, 4.545),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                new ItemEffectData(ItemEffect.BurstSize, 1.0),
                new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                new ItemEffectData(ItemEffect.BreachDamage, 4.1),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.Jitter, 5.0),
                new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 1800.0)
        ));
    }

    @Override
    public long price()
    {
        return 1_167_360;
    }
}