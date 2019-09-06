package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FixedShockCannon_Medium extends AbstractExperimentalModule
{
    public FixedShockCannon_Medium()
    {
        super("Medium Fixed Shock Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.human, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.57),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 129.6),
                  new ItemEffectData(ItemEffect.Damage, 12.96),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.47),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.8),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 404.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 9.1),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 60.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
            ));
    }
}