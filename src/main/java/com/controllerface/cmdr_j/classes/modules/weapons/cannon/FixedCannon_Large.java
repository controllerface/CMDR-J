package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedCannon_Large extends AbstractCannon
{
    public FixedCannon_Large()
    {
        super("3C Fixed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.67),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 23.37),
                        new ItemEffectData(ItemEffect.Damage, 55.63),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.07),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.2),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 70.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 960.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4202),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 120.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 52.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 4000.0)
                ));
    }

    @Override
    public long price()
    {
        return 675_200;
    }
}