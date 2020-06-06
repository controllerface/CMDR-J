package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedShockCannon_Large extends AbstractExperimentalModule
{
    public FixedShockCannon_Large()
    {
        super("3C Fixed Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.89),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 161.4),
                        new ItemEffectData(ItemEffect.Damage, 18.14),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.92),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.66),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 12.7),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_015_750;
    }
}