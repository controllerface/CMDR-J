package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianPlasmaCharger_Large extends AbstractGuardianModule
{
    public FixedGuardianPlasmaCharger_Large()
    {
        super("Large Fixed Guardian Plasma Charger", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 3.1),
                  new ItemEffectData(ItemEffect.Damage_Multiplier_at_Full_Charge, 17.0),
                  new ItemEffectData(ItemEffect.Damage, 3.9),
                  new ItemEffectData(ItemEffect.DistributorDraw, 2.42),
                  new ItemEffectData(ItemEffect.ThermalLoad, 6.2),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 95.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 1.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 1.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }
}