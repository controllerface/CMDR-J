package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedGuardianPlasmaCharger_Large extends AbstractGuardianModule
{
    public TurretedGuardianPlasmaCharger_Large()
    {
        super("3D Turreted Guardian Plasma Charger",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.53),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 30.0),
                        new ItemEffectData(ItemEffect.Damage, 6.0),
                        //new ItemEffectData(ItemEffect.ChargeTime, 1.8), // todo: find this stat
                        new ItemEffectData(ItemEffect.Damage_Multiplier_at_Full_Charge, 17.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 2.6),
                        new ItemEffectData(ItemEffect.ThermalLoad, 6.4),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 95.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Absolute/AX"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }

    @Override
    public long price()
    {
        return 5_495_200;
    }
}