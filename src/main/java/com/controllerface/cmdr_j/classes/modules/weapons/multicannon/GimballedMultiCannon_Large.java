package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedMultiCannon_Large extends AbstractMultiCannon
{
    public GimballedMultiCannon_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.97),
                new ItemEffectData(ItemEffect.DamagePerSecond, 18.93),
                new ItemEffectData(ItemEffect.Damage, 2.84),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.25),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.34),
                new ItemEffectData(ItemEffect.ArmourPenetration, 54.0),
                new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                new ItemEffectData(ItemEffect.RateOfFire, 6.667),
                new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                new ItemEffectData(ItemEffect.BreachDamage, 2.6),
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
        return 578_436;
    }
}