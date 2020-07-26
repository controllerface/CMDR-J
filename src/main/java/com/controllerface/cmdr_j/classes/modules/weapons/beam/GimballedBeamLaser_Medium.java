package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBeamLaser_Medium extends AbstractBeamLaser
{
    public GimballedBeamLaser_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.0),
                new ItemEffectData(ItemEffect.DamagePerSecond, 12.52),
                new ItemEffectData(ItemEffect.Damage, 12.52),
                new ItemEffectData(ItemEffect.DistributorDraw, 3.44),
                new ItemEffectData(ItemEffect.ThermalLoad, 5.32),
                new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                new ItemEffectData(ItemEffect.BreachDamage, 10.0),
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
        return 500_600;
    }
}