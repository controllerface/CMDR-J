package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPlasmaAcceleratorAdvanced_Large extends AbstractPlasmaAccelerator
{
    public FixedPlasmaAcceleratorAdvanced_Large()
    {
        super("Large Fixed Plasma Accelerator (Advanced)", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.97),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 28.67),
                  new ItemEffectData(ItemEffect.Damage, 34.4),
                  new ItemEffectData(ItemEffect.DistributorDraw, 5.5),
                  new ItemEffectData(ItemEffect.ThermalLoad, 11.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3500.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 875.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.8333),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 20.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 300.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 30.9),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }
}