package com.controllerface.cmdr_j.classes.modules.weapons.seekermissile;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SeekerMissileRack_Large extends AbstractSeekerMissileRack
{
    public SeekerMissileRack_Large()
    {
        super("Large Fixed Seeker Missile Rack",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.62),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 13.333),
                  new ItemEffectData(ItemEffect.Damage, 40.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                  new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 625.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.3333),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 36.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 12.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 16.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                  new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }

    @Override
    public long price()
    {
        return 1_471_030;
    }
}