package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedCannon_Small extends AbstractCannon
{
    public GimballedCannon_Small()
    {
        super("1E Gimballed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.38),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 8.292),
                        new ItemEffectData(ItemEffect.Damage, 15.92),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.48),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.25),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5208),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 15.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 3000.0)
                ));
    }

    @Override
    public long price()
    {
        return 42_200;
    }
}