package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPlasmaAccelerator_Large extends AbstractPlasmaAccelerator
{
    public FixedPlasmaAccelerator_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.97),
                new ItemEffectData(ItemEffect.DamagePerSecond, 24.17),
                new ItemEffectData(ItemEffect.Damage, 83.4),
                new ItemEffectData(ItemEffect.DistributorDraw, 13.6),
                new ItemEffectData(ItemEffect.ThermalLoad, 21.75),
                new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 875.0),
                new ItemEffectData(ItemEffect.RateOfFire, 0.2899),
                new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                new ItemEffectData(ItemEffect.BreachDamage, 70.9),
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
        return 3_051_200;
    }
}