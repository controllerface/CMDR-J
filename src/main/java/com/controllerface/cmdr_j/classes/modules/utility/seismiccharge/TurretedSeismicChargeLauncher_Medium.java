package com.controllerface.cmdr_j.classes.modules.utility.seismiccharge;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedSeismicChargeLauncher_Medium extends AbstractSeismicChargeLauncher
{
    public TurretedSeismicChargeLauncher_Medium()
    {
        super("2B Turreted Seismic Charge Launcher",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.Damage_Multiplier_at_Full_Charge, 1.0),
                        new ItemEffectData(ItemEffect.Damage, 15.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 350.0),
                        new ItemEffectData(ItemEffect.BurstSize, 1.0),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, -1.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 72.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 1.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 1.0),
                        new ItemEffectData(ItemEffect.ECMTimeToCharge, 2.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.0),
                        new ItemEffectData(ItemEffect.Jitter, 0.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret")
                ));
    }

    @Override
    public long price()
    {
        return 445_570;
    }
}