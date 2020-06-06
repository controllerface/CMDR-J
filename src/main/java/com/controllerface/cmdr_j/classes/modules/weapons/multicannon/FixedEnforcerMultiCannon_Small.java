package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedEnforcerMultiCannon_Small extends AbstractMultiCannon
{
    public FixedEnforcerMultiCannon_Small()
    {
        super("1F Fixed Enforcer (Multi-Cannon)",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.28),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 12.391),
                        new ItemEffectData(ItemEffect.Damage, 2.85),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.12),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.18),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 30.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1800.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 4.348),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 60.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 1000.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 2.6),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 13_980;
    }
}