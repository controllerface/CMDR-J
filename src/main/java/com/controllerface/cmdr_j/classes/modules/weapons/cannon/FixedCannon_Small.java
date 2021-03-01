package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedCannon_Small extends AbstractCannon
{
    public FixedCannon_Small()
    {
        super("1D Fixed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 11.25),
                        new ItemEffectData(ItemEffect.Damage, 22.5),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.46),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.38),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 120.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 21.4),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 3000.0)
                ));
    }

    @Override
    public long price()
    {
        return 21_100;
    }
}