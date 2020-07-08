package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedCytoscramblerBurstLaser_Small extends AbstractBurstLaser
{
    public FixedCytoscramblerBurstLaser_Small()
    {
        super("Cytoscrambler",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "F"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.8),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 27.43),
                        new ItemEffectData(ItemEffect.Damage, 3.6),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.31),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.28),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 1.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 1000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 7.619),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 20.0),
                        new ItemEffectData(ItemEffect.BurstSize, 8.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.Jitter, 3.5),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
                ));
    }

    @Override
    public long price()
    {
        return 8_800;
    }
}