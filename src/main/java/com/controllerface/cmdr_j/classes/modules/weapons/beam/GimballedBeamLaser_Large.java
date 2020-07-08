package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBeamLaser_Large extends AbstractBeamLaser
{
    public GimballedBeamLaser_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.6),
                new ItemEffectData(ItemEffect.DamagePerSecond, 20.3),
                new ItemEffectData(ItemEffect.Damage, 20.3),
                new ItemEffectData(ItemEffect.DistributorDraw, 5.58),
                new ItemEffectData(ItemEffect.ThermalLoad, 7.61),
                new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                new ItemEffectData(ItemEffect.BreachDamage, 16.2),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
        ));
    }

    @Override
    public long price()
    {
        return 2_396_160;
    }
}