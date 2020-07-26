package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedPulseLaser_Medium extends AbstractPulseLaser
{
    public TurretedPulseLaser_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "F"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.58),
                new ItemEffectData(ItemEffect.DamagePerSecond, 6.212),
                new ItemEffectData(ItemEffect.Damage, 2.05),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.33),
                new ItemEffectData(ItemEffect.ThermalLoad, 0.33),
                new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, 3.03),
                new ItemEffectData(ItemEffect.BreachDamage, 1.7),
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
        return 132_800;
    }
}