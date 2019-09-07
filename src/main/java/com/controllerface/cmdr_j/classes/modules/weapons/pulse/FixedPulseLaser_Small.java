package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedPulseLaser_Small extends AbstractPulseLaser
{
    public FixedPulseLaser_Small()
    {
        super("Small Fixed Pulse Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.39),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 7.885),
                  new ItemEffectData(ItemEffect.Damage, 2.05),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.3),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.33),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 20.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 3.846),
                  new ItemEffectData(ItemEffect.BreachDamage, 1.7),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }
}