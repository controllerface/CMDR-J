package com.controllerface.cmdr_j.classes.modules.weapons.flechecttelauncher;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedRemoteReleaseFlechetteLauncher_Medium extends AbstractExperimentalModule
{
    public FixedRemoteReleaseFlechetteLauncher_Medium()
    {
        super("2B Fixed Remote Release Flechette Launcher",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.human, 1.0),
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
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic")
            ));
    }

    @Override
    public long price()
    {
        return 353_761;
    }
}