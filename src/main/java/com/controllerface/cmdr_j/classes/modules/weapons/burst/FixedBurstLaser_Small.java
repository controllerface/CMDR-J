package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedBurstLaser_Small extends AbstractBurstLaser
{
    public FixedBurstLaser_Small()
    {
        super("1F Fixed Burst Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.65),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 8.147),
                        new ItemEffectData(ItemEffect.Damage, 1.72),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.25),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.38),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 4.737),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 15.0),
                        new ItemEffectData(ItemEffect.BurstSize, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.5),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }

    @Override
    public long price()
    {
        return 4_400;
    }
}