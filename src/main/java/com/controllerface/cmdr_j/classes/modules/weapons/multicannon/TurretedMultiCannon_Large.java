package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedMultiCannon_Large extends AbstractMultiCannon
{
    public TurretedMultiCannon_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.86),
                new ItemEffectData(ItemEffect.DamagePerSecond, 11.737),
                new ItemEffectData(ItemEffect.Damage, 2.23),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.16),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.19),
                new ItemEffectData(ItemEffect.ArmourPenetration, 54.0),
                new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                new ItemEffectData(ItemEffect.RateOfFire, 5.263),
                new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                new ItemEffectData(ItemEffect.BreachDamage, 2),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
        ));
    }

    @Override
    public long price()
    {
        return 3_794_601;
    }
}