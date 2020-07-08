package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBurstLaser_Small extends AbstractBurstLaser
{
    public GimballedBurstLaser_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "G"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                new ItemEffectData(ItemEffect.DamagePerSecond, 6.448),
                new ItemEffectData(ItemEffect.Damage, 1.22),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.34),
                new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 5.285),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 17.0),
                new ItemEffectData(ItemEffect.BurstSize, 3.0),
                new ItemEffectData(ItemEffect.BreachDamage, 1.0),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
        ));
    }

    @Override
    public long price()
    {
        return 8_600;
    }
}