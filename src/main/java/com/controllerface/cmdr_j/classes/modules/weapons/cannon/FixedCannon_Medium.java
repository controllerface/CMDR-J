package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedCannon_Medium extends AbstractCannon
{
    public FixedCannon_Medium()
    {
        super("2D Fixed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.49),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 16.99),
                        new ItemEffectData(ItemEffect.Damage, 36.88),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.7),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.11),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1050.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4608),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 120.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 35.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 3500.0)
                ));
    }

    @Override
    public long price()
    {
        return 168_430;
    }
}