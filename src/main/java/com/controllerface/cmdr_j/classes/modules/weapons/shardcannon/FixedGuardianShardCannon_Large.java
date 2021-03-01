package com.controllerface.cmdr_j.classes.modules.weapons.shardcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianShardCannon_Large extends AbstractGuardianModule
{
    public FixedGuardianShardCannon_Large()
    {
        super("Shard Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.68),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 190.0),
                        new ItemEffectData(ItemEffect.Damage, 9.5),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.4),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.2),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                        new ItemEffectData(ItemEffect.MaxRange, 1_700.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1_133.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.667),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12),
                        new ItemEffectData(ItemEffect.ReloadTime, 5),
                        new ItemEffectData(ItemEffect.BreachDamage, 4.2),
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
        return 1_461_350;
    }
}