package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedFragmentCannon_Large extends AbstractFragCannon
{
    public GimballedFragmentCannon_Large()
    {
        super("Large Gimballed Fragment Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.55),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 215.4),
                  new ItemEffectData(ItemEffect.Damage, 3.77),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.81),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.4),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 45.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 4.762),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                  new ItemEffectData(ItemEffect.BurstSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 3.4),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.Jitter, 5.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1800.0)
            ));
    }
}