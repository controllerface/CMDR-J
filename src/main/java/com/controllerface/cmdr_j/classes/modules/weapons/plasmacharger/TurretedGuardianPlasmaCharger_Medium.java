package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedGuardianPlasmaCharger_Medium extends AbstractGuardianModule
{
    public TurretedGuardianPlasmaCharger_Medium()
    {
        super("Medium Turreted Guardian Plasma Charger", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 42.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.01),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 34.0),
                  new ItemEffectData(ItemEffect.Damage, 4.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.4),
                  new ItemEffectData(ItemEffect.ThermalLoad, 5.8),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 80.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 17.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 1.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }
}