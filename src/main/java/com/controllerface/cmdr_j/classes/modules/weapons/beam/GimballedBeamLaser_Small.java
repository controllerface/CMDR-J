package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedBeamLaser_Small extends AbstractBeamLaser
{
    public GimballedBeamLaser_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                new ItemEffectData(ItemEffect.DamagePerSecond, 7.68),
                new ItemEffectData(ItemEffect.Damage, 7.68),
                new ItemEffectData(ItemEffect.DistributorDraw, 2.11),
                new ItemEffectData(ItemEffect.ThermalLoad, 3.65),
                new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                new ItemEffectData(ItemEffect.BreachDamage, 6.1),
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
        return 74_650;
    }
}