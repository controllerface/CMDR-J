package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.weapons.burst.AbstractBurstLaser;

public class GimballedBurstLaser_Huge extends AbstractBurstLaser
{
    public GimballedBurstLaser_Huge()
    {
        super("Huge Gimballed Burst Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.59),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 25.91),
                  new ItemEffectData(ItemEffect.Damage, 12.09),
                  new ItemEffectData(ItemEffect.DistributorDraw, 2.41),
                  new ItemEffectData(ItemEffect.ThermalLoad, 3.33),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 65.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 2.143),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, 5.0),
                  new ItemEffectData(ItemEffect.BurstSize, 3.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 10.3),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }
}