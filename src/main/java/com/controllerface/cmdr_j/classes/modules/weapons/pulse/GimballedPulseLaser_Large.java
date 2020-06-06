package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedPulseLaser_Large extends AbstractPulseLaser
{
    public GimballedPulseLaser_Large()
    {
        super("3E Gimballed Pulse Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.92),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 14.774),
                        new ItemEffectData(ItemEffect.Damage, 4.58),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.92),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.92),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 3.226),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.9),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }

    @Override
    public long price()
    {
        return 140_600;
    }
}