package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedDisruptorPulseLaser_Medium extends AbstractPulseLaser
{
    public FixedDisruptorPulseLaser_Medium()
    {
        super("2E Fixed Disruptor (Pulse Laser)",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 4.667),
                        new ItemEffectData(ItemEffect.Damage, 2.8),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.9),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.667),
                        new ItemEffectData(ItemEffect.BreachDamage, 2.4),
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
        return 26_400;
    }
}