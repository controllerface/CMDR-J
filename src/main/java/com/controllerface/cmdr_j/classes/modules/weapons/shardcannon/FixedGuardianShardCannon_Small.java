package com.controllerface.cmdr_j.classes.modules.weapons.shardcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianShardCannon_Small extends AbstractGuardianModule
{
    public FixedGuardianShardCannon_Small()
    {
        super("1D Fixed Guardian Shard Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 34.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.87),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 72.8),
                        new ItemEffectData(ItemEffect.Damage, 3.64),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.42),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.69),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 1_700.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1_133.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.667),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12),
                        new ItemEffectData(ItemEffect.ReloadTime, 5),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.6),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.Jitter, 5.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal/AX"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1700.0)
            ));
    }

    @Override
    public long price()
    {
        return 151_650;
    }
}