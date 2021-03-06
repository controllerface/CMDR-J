package com.controllerface.cmdr_j.classes.modules.weapons.gausscannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianGaussCannon_Medium extends AbstractGuardianModule
{
    public FixedGuardianGaussCannon_Medium()
    {
        super("Gauss Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 42.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.61),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 46.4),
                        new ItemEffectData(ItemEffect.Damage, 38.5),
                        new ItemEffectData(ItemEffect.DistributorDraw, 7.2),
                        new ItemEffectData(ItemEffect.ThermalLoad, 25.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 140.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.2048),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 80.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 1.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 35.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 20.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 543_801;
    }
}