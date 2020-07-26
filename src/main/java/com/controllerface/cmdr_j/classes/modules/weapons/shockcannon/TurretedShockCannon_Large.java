package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedShockCannon_Large extends AbstractHumanModule
{
    public TurretedShockCannon_Large()
    {
        super("Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 122.6),
                        new ItemEffectData(ItemEffect.Damage, 12.26),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.79),
                        new ItemEffectData(ItemEffect.ThermalLoad, 2.2),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 8.6),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 60.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
                ));
    }

    @Override
    public long price()
    {
        return 6_050_201;
    }
}