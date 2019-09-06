package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldGenerator_4C extends AbstractShieldGenerator
{
    public ShieldGenerator_4C()
    {
        super("4C Shield Generator",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.2),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 100.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}