package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedBeamLaser_Large extends AbstractBeamLaser
{
    public TurretedBeamLaser_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.51),
                new ItemEffectData(ItemEffect.DamagePerSecond, 14.36),
                new ItemEffectData(ItemEffect.Damage, 14.36),
                new ItemEffectData(ItemEffect.DistributorDraw, 3.51),
                new ItemEffectData(ItemEffect.ThermalLoad, 5.11),
                new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                new ItemEffectData(ItemEffect.BreachDamage, 11.5),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
        ));
    }

    @Override
    public long price()
    {
        return 19_399_600;
    }
}