package com.controllerface.cmdr_j.classes.modules.weapons.flechecttelauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedRemoteReleaseFlechetteLauncher_Medium extends AbstractHumanModule
{
    public FixedRemoteReleaseFlechetteLauncher_Medium()
    {
        super("Remote Release Flechette Launcher",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 6.5),
                        new ItemEffectData(ItemEffect.Damage, 13.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 80.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 550.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 72.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 2.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 6.5),
                        new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 353_761;
    }
}