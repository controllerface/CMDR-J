package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPulseLaser_Large extends AbstractPulseLaser
{
    public FixedPulseLaser_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.9),
                new ItemEffectData(ItemEffect.DamagePerSecond, 18.12),
                new ItemEffectData(ItemEffect.Damage, 5.98),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.86),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.96),
                new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 3.03),
                new ItemEffectData(ItemEffect.BreachDamage, 5.1),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
        ));
    }

    @Override
    public long price()
    {
        return 70_400;
    }
}