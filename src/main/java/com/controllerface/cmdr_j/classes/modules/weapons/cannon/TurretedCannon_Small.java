package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedCannon_Small extends AbstractCannon
{
    public TurretedCannon_Small()
    {
        super("1F Turreted Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.32),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 5.258),
                        new ItemEffectData(ItemEffect.Damage, 12.77),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.22),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.67),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.4329),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 12.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 3000.0)
            ));
    }

    @Override
    public long price()
    {
        return 506_400;
    }
}