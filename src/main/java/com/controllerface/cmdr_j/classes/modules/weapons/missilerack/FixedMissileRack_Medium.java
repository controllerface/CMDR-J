package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.weapons.missilerack.AbstractMissileRack;

public class FixedMissileRack_Medium extends AbstractMissileRack
{
    public FixedMissileRack_Medium()
    {
        super("Medium Fixed Missile Rack", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 25.0),
                  new ItemEffectData(ItemEffect.Damage, 50.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                  new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 12.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 48.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 20.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }
}