package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPulseLaser_Medium extends AbstractPulseLaser
{
    public FixedPulseLaser_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                new ItemEffectData(ItemEffect.DamagePerSecond, 12.069),
                new ItemEffectData(ItemEffect.Damage, 3.5),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.5),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.56),
                new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 3.448),
                new ItemEffectData(ItemEffect.BreachDamage, 3.0),
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
        return 17_600;
    }
}