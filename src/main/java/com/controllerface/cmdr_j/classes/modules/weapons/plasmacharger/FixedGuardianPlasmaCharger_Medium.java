package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianPlasmaCharger_Medium extends AbstractGuardianModule
{
    public FixedGuardianPlasmaCharger_Medium()
    {
        super("Plasma Charger",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 42.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.13),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 25.0),
                        new ItemEffectData(ItemEffect.Damage, 5),
                        //new ItemEffectData(ItemEffect.ChargeTime, 1.8), // todo: find this stat
                        new ItemEffectData(ItemEffect.Damage_Multiplier_guardian, 17.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.25),
                        new ItemEffectData(ItemEffect.ThermalLoad, 5.21),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 80.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.6), // guess
                        new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Absolute/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
                ));
    }

    @Override
    public long price()
    {
        return 498_210;
    }
}