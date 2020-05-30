package com.controllerface.cmdr_j.classes.modules.weapons.seekermissile;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PackHound_Medium extends AbstractSeekerMissileRack
{
    public PackHound_Medium()
    {
        super("Medium Pixed Pack-Hound (Seeker Missile Rack)",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 60.0),
                        new ItemEffectData(ItemEffect.Damage, 7.5),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 600.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 2.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 120.0),
                        new ItemEffectData(ItemEffect.RoundsPerShot, 4.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }

    @Override
    public long price()
    {
        return 768_600;
    }
}