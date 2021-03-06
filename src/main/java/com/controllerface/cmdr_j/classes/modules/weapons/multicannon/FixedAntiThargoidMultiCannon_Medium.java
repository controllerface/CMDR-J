package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedAntiThargoidMultiCannon_Medium extends AbstractExperimentalModule
{
    public FixedAntiThargoidMultiCannon_Medium()
    {
        super("Anti-Thargoid Multi-Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.46),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 23.64),
                        new ItemEffectData(ItemEffect.Damage, 3.31),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.11),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.18),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 17.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 7.143),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 100.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 2.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
                ));
    }

    @Override
    public long price()
    {
        return 379_000;
    }
}