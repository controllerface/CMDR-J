package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedPulseLaser_Huge extends AbstractPulseLaser
{
    public GimballedPulseLaser_Huge()
    {
        super("4A Gimballed Pulse Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 80.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.37),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 21.72),
                        new ItemEffectData(ItemEffect.Damage, 7.82),
                        new ItemEffectData(ItemEffect.DistributorDraw, 1.56),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.56),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 65.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 2.778),
                        new ItemEffectData(ItemEffect.BreachDamage, 6.6),
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
        return 877_600;
    }
}