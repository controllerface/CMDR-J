package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedFragmentCannon_Small extends AbstractFragCannon
{
    public GimballedFragmentCannon_Small()
    {
        super("1E Gimballed Fragment Cannon",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.59),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 71.29),
                  new ItemEffectData(ItemEffect.Damage, 1.01),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.26),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.44),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 2000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 5.882),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 1.0),
                  new ItemEffectData(ItemEffect.BurstSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 180.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 12.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.9),
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
        return 54_720;
    }
}