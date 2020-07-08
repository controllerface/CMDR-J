package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBurstLaser_Medium extends AbstractBurstLaser
{
    public GimballedBurstLaser_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "F"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.04),
                new ItemEffectData(ItemEffect.DamagePerSecond, 10.296),
                new ItemEffectData(ItemEffect.Damage, 2.45),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.49),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.67),
                new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 4.203),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 13.0),
                new ItemEffectData(ItemEffect.BurstSize, 3.0),
                new ItemEffectData(ItemEffect.BreachDamage, 2.1),
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
        return 48_500;
    }
}