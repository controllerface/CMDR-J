package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPacifierFragmentCannon_Large extends AbstractFragCannon
{
    public FixedPacifierFragmentCannon_Large()
    {
        super("3C Fixed Pacifier (Fragment Cannon)",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.02),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 2116.0),
                        new ItemEffectData(ItemEffect.Damage, 3.96),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.57),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.13),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 4.5454),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                        new ItemEffectData(ItemEffect.BurstSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.Jitter, 1.7),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1800.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_400_830;
    }
}