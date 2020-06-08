package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedPulseLaser_Large extends AbstractPulseLaser
{
    public TurretedPulseLaser_Large()
    {
        super("3F Turreted Pulse Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.89),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 9.459),
                        new ItemEffectData(ItemEffect.Damage, 3.5),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.56),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.56),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 52.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 2.703),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.0),
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
        return 400_400;
    }
}