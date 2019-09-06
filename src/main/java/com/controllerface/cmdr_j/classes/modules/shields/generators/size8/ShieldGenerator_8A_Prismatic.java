package com.controllerface.cmdr_j.classes.modules.shields.generators.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldGenerator_8A_Prismatic extends AbstractShieldGenerator
{
    public ShieldGenerator_8A_Prismatic()
    {
        super("8A Prismatic Shield Generator",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 320.0),
                  new ItemEffectData(ItemEffect.Integrity, 180.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 8.4),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 150.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.4),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 5.4),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}