package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPulseLaser_Huge extends AbstractPulseLaser
{
    public FixedPulseLaser_Huge()
    {
        super("Huge Fixed Pulse Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.33),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 26.95),
                  new ItemEffectData(ItemEffect.Damage, 10.24),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.48),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.64),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 65.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 2.632),
                  new ItemEffectData(ItemEffect.BreachDamage, 8.7),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }
}