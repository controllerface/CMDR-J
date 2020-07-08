package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedBurstLaser_Large extends AbstractBurstLaser
{
    public FixedBurstLaser_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.66),
                new ItemEffectData(ItemEffect.DamagePerSecond, 20.78),
                new ItemEffectData(ItemEffect.Damage, 7.73),
                new ItemEffectData(ItemEffect.DistributorDraw, 1.11),
                new ItemEffectData(ItemEffect.ThermalLoad, 1.7),
                new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 2.689),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 7.0),
                new ItemEffectData(ItemEffect.BurstSize, 3.0),
                new ItemEffectData(ItemEffect.BreachDamage, 3.9),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
        ));
    }

    @Override
    public long price()
    {
        return 140_400;
    }
}