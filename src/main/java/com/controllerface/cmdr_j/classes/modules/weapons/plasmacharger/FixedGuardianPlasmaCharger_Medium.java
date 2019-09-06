package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FixedGuardianPlasmaCharger_Medium extends AbstractGuardianModule
{
    public FixedGuardianPlasmaCharger_Medium()
    {
        super("Medium Fixed Guardian Plasma Charger", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 42.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.13),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 42.5),
                  new ItemEffectData(ItemEffect.Damage, 5.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.25),
                  new ItemEffectData(ItemEffect.ThermalLoad, 5.21),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 80.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 17.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 1.3),
                  new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }
}