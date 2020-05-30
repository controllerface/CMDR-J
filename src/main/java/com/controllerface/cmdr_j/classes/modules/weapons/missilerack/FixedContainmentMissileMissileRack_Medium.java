package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedContainmentMissileMissileRack_Medium extends AbstractMissileRack
{
    public FixedContainmentMissileMissileRack_Medium()
    {
        super("Medium Fixed Rocket Propelled FSD Disruptor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 13.333),
                        new ItemEffectData(ItemEffect.Damage, 40.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                        new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.3333),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 48.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 16.0),
                        new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }

    @Override
    public long price()
    {
        return 1_951_040;
    }
}