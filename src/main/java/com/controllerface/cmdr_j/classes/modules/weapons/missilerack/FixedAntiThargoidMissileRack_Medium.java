package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FixedAntiThargoidMissileRack_Medium extends AbstractExperimentalModule
{
    public FixedAntiThargoidMissileRack_Medium()
    {
        super("Medium Fixed Anti-Thargoid Missile Rack", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.experimental, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 32.0),
                  new ItemEffectData(ItemEffect.Damage, 64.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.14),
                  new ItemEffectData(ItemEffect.ThermalLoad, 2.4),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 8.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 64.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.1),
                  new ItemEffectData(ItemEffect.MinBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.DamageType, "Anti-Thargoid"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 0.0)
            ));
    }
}