package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GimballedPulseLaser_Medium extends AbstractPulseLaser
{
    public GimballedPulseLaser_Medium()
    {
        super("Medium Gimballed Pulse Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 9.571),
                  new ItemEffectData(ItemEffect.Damage, 2.68),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.54),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.54),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 35.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 3.571),
                  new ItemEffectData(ItemEffect.BreachDamage, 2.3),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 500.0)
            ));
    }
}