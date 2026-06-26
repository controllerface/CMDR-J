package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPlasmaShockAcceleratorMKII_Large extends AbstractHumanModule
{
    public FixedPlasmaShockAcceleratorMKII_Large()
    {
        super("Plasma Shock Accelerator", new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.51),
                new ItemEffectData(ItemEffect.DamagePerSecond, 212.8),
                new ItemEffectData(ItemEffect.Damage, 13.9),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.92),
                new ItemEffectData(ItemEffect.ThermalLoad, 1.7),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                new ItemEffectData(ItemEffect.RateOfFire, 15.31),
                new ItemEffectData(ItemEffect.AmmoClipSize, 18.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 0.0),
                new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                new ItemEffectData(ItemEffect.BreachDamage, 9.8),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 60.0),
                new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 5000.0)
        ));
    }

    @Override
    public long price()
    {
        return 4_612_670;
    }
}