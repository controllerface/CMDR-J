package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedMultiCannon_Small extends AbstractMultiCannon
{
    public TurretedMultiCannon_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "G"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.26),
                new ItemEffectData(ItemEffect.DamagePerSecond, 4.0),
                new ItemEffectData(ItemEffect.Damage, 0.56),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.03),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.04),
                new ItemEffectData(ItemEffect.ArmourPenetration, 22.0),
                new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                new ItemEffectData(ItemEffect.RateOfFire, 7.143),
                new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                new ItemEffectData(ItemEffect.BreachDamage, 0.5),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
        ));
    }

    @Override
    public long price()
    {
        return 81_600;
    }
}