package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBurstLaser_Large extends AbstractBurstLaser
{
    public GimballedBurstLaser_Large()
    {
        super("Large Gimballed Burst Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.65),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 16.61),
                  new ItemEffectData(ItemEffect.Damage, 5.16),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.03),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.42),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 3.218),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 9.0),
                  new ItemEffectData(ItemEffect.BurstSize, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 4.4),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }

    @Override
    public long price()
    {
        return 281_600;
    }
}