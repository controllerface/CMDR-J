package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedCannon_Large extends AbstractCannon
{
    public GimballedCannon_Large()
    {
        super("3C Gimballed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.75),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 16.49),
                        new ItemEffectData(ItemEffect.Damage, 37.42),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.14),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.93),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 70.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 800.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4405),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 35.5),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 4000.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_350_400;
    }
}