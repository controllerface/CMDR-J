package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPlasmaAccelerator_Medium extends AbstractPlasmaAccelerator
{
    public FixedPlasmaAccelerator_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.43),
                new ItemEffectData(ItemEffect.DamagePerSecond, 17.92),
                new ItemEffectData(ItemEffect.Damage, 54.3),
                new ItemEffectData(ItemEffect.DistributorDraw, 8.65),
                new ItemEffectData(ItemEffect.ThermalLoad, 15.58),
                new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 875.0),
                new ItemEffectData(ItemEffect.RateOfFire, 0.33),
                new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                new ItemEffectData(ItemEffect.BreachDamage, 46.2),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
        ));
    }

    @Override
    public long price()
    {
        return 834_200;
    }
}