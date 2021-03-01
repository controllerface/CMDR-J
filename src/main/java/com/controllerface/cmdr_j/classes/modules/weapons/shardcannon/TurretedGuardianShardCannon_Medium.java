package com.controllerface.cmdr_j.classes.modules.weapons.shardcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedGuardianShardCannon_Medium extends AbstractGuardianModule
{
    public TurretedGuardianShardCannon_Medium()
    {
        super("Shard Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 42.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.16),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 86.8),
                        new ItemEffectData(ItemEffect.Damage, 4.34),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.57),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.09),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                        new ItemEffectData(ItemEffect.MaxRange, 1_700.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1_133.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.667),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12),
                        new ItemEffectData(ItemEffect.ReloadTime, 5),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.9),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.Jitter, 5.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1700.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_767_001;
    }
}