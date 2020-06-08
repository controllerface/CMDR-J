package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedBurstLaser_Large extends AbstractBurstLaser
{
    public TurretedBurstLaser_Large()
    {
        super("3E Turreted Burst Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.57),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 11.01),
                        new ItemEffectData(ItemEffect.Damage, 3.53),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.56),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.78),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 3.119),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 11.0),
                        new ItemEffectData(ItemEffect.BurstSize, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
                ));
    }

    @Override
    public long price()
    {
        return 800_400;
    }
}