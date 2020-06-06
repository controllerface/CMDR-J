package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianPlasmaCharger_Small extends AbstractGuardianModule
{
    public FixedGuardianPlasmaCharger_Small()
    {
        super("1D Fixed Guardian Plasma Charger",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 34.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.4),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 15.0),
                        new ItemEffectData(ItemEffect.Damage, 3),
                        //new ItemEffectData(ItemEffect.ChargeTime, 1.8), // todo: find this stat
                        new ItemEffectData(ItemEffect.Damage_Multiplier_at_Full_Charge, 17.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.68),
                        new ItemEffectData(ItemEffect.ThermalLoad, 4.21),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 65.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 200.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 3.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.4),
                        new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Absolute/AX"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }

    @Override
    public long price()
    {
        return 176_500;
    }
}
