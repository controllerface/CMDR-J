package com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedSubSurfaceDisplacementMissile_Small extends AbstractSubsurfaceMissileLauncher
{
    public FixedSubSurfaceDisplacementMissile_Small()
    {
        super("Small Fixed Sub-Surface Displacement Missile",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.42),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 2.5),
                        new ItemEffectData(ItemEffect.Damage, 5.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 550.0),
                        new ItemEffectData(ItemEffect.BurstSize, 1.0),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, -1.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 32.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 2.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 1.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.18),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.25),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 25.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.5),
                        new ItemEffectData(ItemEffect.Jitter, 0.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 10.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 20.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }

    @Override
    public long price()
    {
        return 12_601;
    }
}