package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedFragmentCannon_Medium extends AbstractFragCannon
{
    public GimballedFragmentCannon_Medium()
    {
        super("Medium Gimballed Fragment Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.03),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 143.62),
                  new ItemEffectData(ItemEffect.Damage, 2.274),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.49),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.84),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 30.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 5.263),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                  new ItemEffectData(ItemEffect.BurstSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 2.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.Jitter, 5.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1800.0)
            ));
    }

    @Override
    public long price()
    {
        return 437_800;
    }
}