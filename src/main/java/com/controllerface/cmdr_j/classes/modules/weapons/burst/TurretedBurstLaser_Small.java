package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedBurstLaser_Small extends AbstractBurstLaser
{
    public TurretedBurstLaser_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "G"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                new ItemEffectData(ItemEffect.DamagePerSecond, 4.174),
                new ItemEffectData(ItemEffect.Damage, 0.87),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.139),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.19),
                new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 4.798),
                new ItemEffectData(ItemEffect.BurstRateOfFire, 19.0),
                new ItemEffectData(ItemEffect.BurstSize, 3.0),
                new ItemEffectData(ItemEffect.BreachDamage, 0.4),
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
        return 52_800;
    }
}