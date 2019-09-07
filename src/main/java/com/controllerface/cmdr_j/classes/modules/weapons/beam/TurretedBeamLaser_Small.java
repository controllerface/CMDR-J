package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedBeamLaser_Small extends AbstractBeamLaser
{
    public TurretedBeamLaser_Small()
    {
        super("Small Turreted Beam Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.57),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 5.4),
                  new ItemEffectData(ItemEffect.DistributorDraw, 1.32),
                  new ItemEffectData(ItemEffect.ThermalLoad, 2.4),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                  new ItemEffectData(ItemEffect.BreachDamage, 4.3),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
            ));
    }
}