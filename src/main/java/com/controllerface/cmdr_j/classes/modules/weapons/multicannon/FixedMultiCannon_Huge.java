package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedMultiCannon_Huge extends AbstractMultiCannon
{
    public FixedMultiCannon_Huge()
    {
        super("Huge Fixed Multi-Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.73),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 28.03),
                  new ItemEffectData(ItemEffect.Damage, 4.625),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.39),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 68.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 3.03),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 2.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 4.2),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }
}