package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedMultiCannon_Medium extends AbstractMultiCannon
{
    public GimballedMultiCannon_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "F"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                new ItemEffectData(ItemEffect.DamagePerSecond, 12.615),
                new ItemEffectData(ItemEffect.Damage, 1.64),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.14),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.2),
                new ItemEffectData(ItemEffect.ArmourPenetration, 37.0),
                new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                new ItemEffectData(ItemEffect.RateOfFire, 7.692),
                new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                new ItemEffectData(ItemEffect.BreachDamage, 1.5),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
        ));
    }

    @Override
    public long price()
    {
        return 57_000;
    }
}