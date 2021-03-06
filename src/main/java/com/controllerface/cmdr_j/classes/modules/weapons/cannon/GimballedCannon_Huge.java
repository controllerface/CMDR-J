package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedCannon_Huge extends AbstractCannon
{
    public GimballedCannon_Huge()
    {
        super("4B Gimballed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 80.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.03),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 22.64),
                        new ItemEffectData(ItemEffect.Damage, 56.59),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.72),
                        new ItemEffectData(ItemEffect.ThermalLoad, 4.43),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 90.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 53.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 4500.0)
                ));
    }

    @Override
    public long price()
    {
        return 5_401_600;
    }
}