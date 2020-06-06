package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedEnzymeMissileRack_Medium extends AbstractExperimentalModule
{
    public FixedEnzymeMissileRack_Medium()
    {
        super("2B Fixed Enzyme Missile Rack",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.human, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 2.5),
                  new ItemEffectData(ItemEffect.Damage, 5.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.08),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.5),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 8.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 64.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 80.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.DamageType, "Caustic")
            ));
    }

    @Override
    public long price()
    {
        return 480_501;
    }
}