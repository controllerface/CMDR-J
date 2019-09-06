package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.weapons.beam.AbstractBeamLaser;

public class TurretedBeamLaser_Large extends AbstractBeamLaser
{
    public TurretedBeamLaser_Large()
    {
        super("Large Turreted Beam Laser", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.51),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 14.36),
                  new ItemEffectData(ItemEffect.DistributorDraw, 3.51),
                  new ItemEffectData(ItemEffect.ThermalLoad, 5.11),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.7976931348623157E308),
                  new ItemEffectData(ItemEffect.BreachDamage, 11.5),
                  new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
            ));
    }
}