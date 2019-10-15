package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedBeamLaser_Large extends AbstractBeamLaser
{
    public FixedBeamLaser_Large()
    {
        super("Large Fixed Beam Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.62),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 25.78),
                  new ItemEffectData(ItemEffect.DistributorDraw, 5.1),
                  new ItemEffectData(ItemEffect.ThermalLoad, 7.22),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                  new ItemEffectData(ItemEffect.BreachDamage, 20.6),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_177_600;
    }
}