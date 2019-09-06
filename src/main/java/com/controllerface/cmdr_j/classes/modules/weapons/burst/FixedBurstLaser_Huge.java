package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FixedBurstLaser_Huge extends AbstractBurstLaser
{
    public FixedBurstLaser_Huge()
    {
        super("Huge Fixed Burst Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.58),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 32.26),
                  new ItemEffectData(ItemEffect.Damage, 20.61),
                  new ItemEffectData(ItemEffect.DistributorDraw, 2.98),
                  new ItemEffectData(ItemEffect.ThermalLoad, 4.53),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 65.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.5652),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 3.0),
                  new ItemEffectData(ItemEffect.BurstSize, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 17.5),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }
}