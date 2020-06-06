package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPlasmaAccelerator_Huge extends AbstractPlasmaAccelerator
{
    public FixedPlasmaAccelerator_Huge()
    {
        super("4A Fixed Plasma Accelerator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 80.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.63),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 31.31),
                        new ItemEffectData(ItemEffect.Damage, 125.25),
                        new ItemEffectData(ItemEffect.DistributorDraw, 21.04),
                        new ItemEffectData(ItemEffect.ThermalLoad, 29.46),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 875.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.25),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 106.5),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 13_793_600;
    }
}