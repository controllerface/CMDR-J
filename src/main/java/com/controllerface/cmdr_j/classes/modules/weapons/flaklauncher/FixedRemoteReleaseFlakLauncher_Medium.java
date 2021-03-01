package com.controllerface.cmdr_j.classes.modules.weapons.flaklauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedRemoteReleaseFlakLauncher_Medium extends AbstractExperimentalModule
{
    public FixedRemoteReleaseFlakLauncher_Medium()
    {
        super("Remote Release Flak Launcher",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 17.0),
                        new ItemEffectData(ItemEffect.Damage, 34.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 550.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 32.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 2.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 1.7),
                        new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
                ));
    }

    @Override
    public long price()
    {
        return 261_800;
    }
}