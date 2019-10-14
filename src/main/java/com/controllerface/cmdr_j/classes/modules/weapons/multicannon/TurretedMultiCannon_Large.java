package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedMultiCannon_Large extends AbstractMultiCannon
{
    public TurretedMultiCannon_Large()
    {
        // todo: update with correct stats, these are form medium
        super("Large Turreted Multi-Cannon",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 7.313),
                  new ItemEffectData(ItemEffect.Damage, 1.17),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 37.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 6.25),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 1.1),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }
}