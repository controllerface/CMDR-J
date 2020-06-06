package com.controllerface.cmdr_j.classes.modules.weapons.shardcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianShardCannon_Medium extends AbstractGuardianModule
{
    public FixedGuardianShardCannon_Medium()
    {
        super("2A Fixed Guardian Shard Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 42.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.21),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 135.4),
                        new ItemEffectData(ItemEffect.Damage, 6.77),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.65),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                        new ItemEffectData(ItemEffect.MaxRange, 1_700.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1_133.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.667),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12),
                        new ItemEffectData(ItemEffect.ReloadTime, 5),
                        new ItemEffectData(ItemEffect.BreachDamage, 3),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.Jitter, 5.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1700.0)
            ));
    }

    @Override
    public long price()
    {
        return 507_761;
    }
}