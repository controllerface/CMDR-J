package com.controllerface.cmdr_j.classes.modules.weapons.railgun;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedImperialHammerRailGun_Medium extends AbstractRailGun
{
    public FixedImperialHammerRailGun_Medium()
    {
        super("Imperial Hammer",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.63),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 61.36),
                        new ItemEffectData(ItemEffect.Damage, 15.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 2.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 11.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 4.091),
                        new ItemEffectData(ItemEffect.BurstRateOfFire, 6.0),
                        new ItemEffectData(ItemEffect.BurstSize, 3.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 1.2),
                        new ItemEffectData(ItemEffect.BreachDamage, 14.3),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "ThermoKinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
                ));
    }

    @Override
    public long price()
    {
        return 619_200;
    }
}