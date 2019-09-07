package com.controllerface.cmdr_j.classes.modules.weapons.railgun;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedRailgun_Medium extends AbstractRailGun
{
    public FixedRailgun_Medium()
    {
        super("Medium Fixed Railgun", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.63),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 50.04),
                  new ItemEffectData(ItemEffect.Damage, 41.53),
                  new ItemEffectData(ItemEffect.DistributorDraw, 5.11),
                  new ItemEffectData(ItemEffect.ThermalLoad, 20.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.2048),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 80.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 1.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 39.5),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "ThermoKinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }
}