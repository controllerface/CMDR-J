package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedPulseLaser_Small extends AbstractPulseLaser
{
    public TurretedPulseLaser_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "G"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.38),
                new ItemEffectData(ItemEffect.DamagePerSecond, 3.967),
                new ItemEffectData(ItemEffect.Damage, 1.19),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.19),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.19),
                new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 3.333),
                new ItemEffectData(ItemEffect.BreachDamage, 1.0),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
        ));
    }

    @Override
    public long price()
    {
        return 26_000;
    }
}