package com.controllerface.cmdr_j.classes.modules.utility.mininglaser;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.utility.mininglaser.AbstractMiningLaser;

public class FixedMiningLaser_Small extends AbstractMiningLaser
{
    public FixedMiningLaser_Small()
    {
        super("Small Fixed Mining Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 2.0),
                  new ItemEffectData(ItemEffect.Damage, 2.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.5),
                  new ItemEffectData(ItemEffect.ThermalLoad, 2.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 500.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.3),
                  new ItemEffectData(ItemEffect.MinBreachChance, 10.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 20.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 300.0)
            ));
    }
}