package com.controllerface.cmdr_j.classes.modules.weapons.torpedo;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedTorpedoPylon_Medium extends AbstractTorpedoPylon
{
    public FixedTorpedoPylon_Medium()
    {
        super("Medium Fixed Torpedo Pylon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 120.0),
                  new ItemEffectData(ItemEffect.Damage, 120.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 50.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 10000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 250.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 1.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 2.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 60.0),
                  new ItemEffectData(ItemEffect.MinBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                  new ItemEffectData(ItemEffect.DamageType, "Explosive")
            ));
    }
}