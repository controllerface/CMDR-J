package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedAdvancedMultiCannon_Small extends AbstractMultiCannon
{
    public FixedAdvancedMultiCannon_Small()
    {
        super("Advanced Multi-Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Anti_Xeno_Ammo_Compatible, "Synthesize"),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "F"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.28),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 8.615),
                        new ItemEffectData(ItemEffect.Damage, 1.12),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 22.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 7.692),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 100.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
                ));
    }

    @Override
    public long price()
    {
        return 9_500;
    }
}