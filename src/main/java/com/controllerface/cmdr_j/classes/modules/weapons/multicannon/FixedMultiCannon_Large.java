package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedMultiCannon_Large extends AbstractMultiCannon
{
    public FixedMultiCannon_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                new ItemEffectData(ItemEffect.DamagePerSecond, 23.09),
                new ItemEffectData(ItemEffect.Damage, 3.925),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.18),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.28),
                new ItemEffectData(ItemEffect.ArmourPenetration, 54.0),
                new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                new ItemEffectData(ItemEffect.RateOfFire, 5.882),
                new ItemEffectData(ItemEffect.AmmoClipSize, 100.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                new ItemEffectData(ItemEffect.BreachDamage, 3.5),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
        ));
    }

    @Override
    public long price()
    {
        return 140_400;
    }
}