package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedBeamLaser_Medium extends AbstractBeamLaser
{
    public FixedBeamLaser_Medium()
    {
        super("2D Fixed Beam Laser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.01),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 15.96),
                        new ItemEffectData(ItemEffect.DistributorDraw, 3.16),
                        new ItemEffectData(ItemEffect.ThermalLoad, 5.11),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                        new ItemEffectData(ItemEffect.BreachDamage, 12.6),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
                ));
    }

    @Override
    public long price()
    {
        return 299_520;
    }
}