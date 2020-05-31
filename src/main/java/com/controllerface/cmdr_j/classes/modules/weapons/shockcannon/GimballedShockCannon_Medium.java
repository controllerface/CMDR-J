package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedShockCannon_Medium extends AbstractExperimentalModule
{
    public GimballedShockCannon_Medium()
    {
        super("Medium Gimballed Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.61),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 102.1),
                        new ItemEffectData(ItemEffect.Damage, 10.21),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.58),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.1),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 40.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 7.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
            ));
    }

    @Override
    public long price()
    {
        return 565_200;
    }
}