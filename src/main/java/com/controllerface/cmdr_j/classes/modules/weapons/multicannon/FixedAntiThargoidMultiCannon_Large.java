package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedAntiThargoidMultiCannon_Large extends AbstractExperimentalModule
{
    public FixedAntiThargoidMultiCannon_Large()
    {
        super("Large Fixed Anti-Thargoid Multi-Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.experimental, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 35.97),
                  new ItemEffectData(ItemEffect.Damage, 6.115),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.18),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.28),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 33.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 5.882),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 100.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 5.2),
                  new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.DamageType, "Anti-Thargoid"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }
}