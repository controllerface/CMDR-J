package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.weapons.cannon.AbstractCannon;

public class TurretedCannon_Large extends AbstractCannon
{
    public TurretedCannon_Large()
    {
        super("Large Turreted Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 11.154),
                  new ItemEffectData(ItemEffect.Damage, 30.34),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.53),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.58),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 70.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 800.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.3676),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 5.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 100.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 28.8),
                  new ItemEffectData(ItemEffect.MinBreachChance, 60.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 90.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 4000.0)
            ));
    }
}