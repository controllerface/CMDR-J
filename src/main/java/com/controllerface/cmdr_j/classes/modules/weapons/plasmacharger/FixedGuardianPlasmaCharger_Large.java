package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianPlasmaCharger_Large extends AbstractGuardianModule
{
    public FixedGuardianPlasmaCharger_Large()
    {
        super("Plasma Charger",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.1),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 35.0),
                        new ItemEffectData(ItemEffect.Damage, 7.0),
                        //new ItemEffectData(ItemEffect.ChargeTime, 1.8), // todo: find this stat
                        new ItemEffectData(ItemEffect.Damage_Multiplier_guardian, 17.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 2.42),
                        new ItemEffectData(ItemEffect.ThermalLoad, 6.15),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 95.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.0),
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
        return 1_248_946;
    }
}