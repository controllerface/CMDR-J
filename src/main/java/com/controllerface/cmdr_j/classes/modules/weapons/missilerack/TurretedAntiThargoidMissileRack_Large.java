package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class TurretedAntiThargoidMissileRack_Large extends AbstractExperimentalModule
{
    public TurretedAntiThargoidMissileRack_Large()
    {
        super("Large Turreted Anti-Thargoid Missile Rack", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.experimental, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.75),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 25.0),
                  new ItemEffectData(ItemEffect.Damage, 50.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.14),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.9),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 5000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 128.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.1),
                  new ItemEffectData(ItemEffect.MinBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.DamageType, "Anti-Thargoid"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 0.0)
            ));
    }
}