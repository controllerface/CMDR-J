package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedCannon_Huge extends AbstractCannon
{
    public FixedCannon_Huge()
    {
        super("4B Fixed Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 80.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.92),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 31.61),
                        new ItemEffectData(ItemEffect.Damage, 83.13),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.61),
                        new ItemEffectData(ItemEffect.ThermalLoad, 4.83),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 90.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 900.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.3802),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 120.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 79.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 4500.0)
            ));
    }

    @Override
    public long price()
    {
        return 2_700_800;
    }
}