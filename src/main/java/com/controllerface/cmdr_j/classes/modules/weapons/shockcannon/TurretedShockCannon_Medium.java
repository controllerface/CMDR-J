package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedShockCannon_Medium extends AbstractHumanModule
{
    public TurretedShockCannon_Medium()
    {
        super("Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 89.6),
                        new ItemEffectData(ItemEffect.Damage, 8.96),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.39),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.24),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 40.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1200.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 10.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 6.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 6.3),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2500.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_359_200;
    }
}