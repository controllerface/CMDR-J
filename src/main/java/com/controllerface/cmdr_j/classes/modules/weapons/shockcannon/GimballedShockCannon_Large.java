package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedShockCannon_Large extends AbstractExperimentalModule
{
    public GimballedShockCannon_Large()
    {
        super("Large Gimballed Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.89),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 148.7),
                        new ItemEffectData(ItemEffect.Damage, 14.87),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.07),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.12),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 10.4),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
            ));
    }

    @Override
    public long price()
    {
        return 2_249_050;
    }
}