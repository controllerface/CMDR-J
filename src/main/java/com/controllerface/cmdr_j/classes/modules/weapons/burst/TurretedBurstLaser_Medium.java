package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedBurstLaser_Medium extends AbstractBurstLaser
{
    public TurretedBurstLaser_Medium()
    {
        super("2F Turreted Burst Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.98),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 6.76),
                        new ItemEffectData(ItemEffect.Damage, 1.72),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.275),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.38),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 3.93),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 15.0),
                        new ItemEffectData(ItemEffect.BurstSize, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.9),
                        new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }

    @Override
    public long price()
    {
        return 162_800;
    }
}