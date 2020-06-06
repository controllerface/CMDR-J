package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedMultiCannon_Huge extends AbstractMultiCannon
{
    public GimballedMultiCannon_Huge()
    {
        super("4A Gimballed Multi-Cannon",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.22),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 23.3),
                  new ItemEffectData(ItemEffect.Damage, 3.46),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.37),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.51),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 68.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 3.367),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 2.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 6_377_600;
    }
}