package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedMultiCannon_Small extends AbstractMultiCannon
{
    public GimballedMultiCannon_Small()
    {
        super("1G Gimballed Multi-Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.37),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 6.833),
                        new ItemEffectData(ItemEffect.Damage, 0.82),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.07),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.1),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 22.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 8.333),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.7),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 14_250;
    }
}