package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldGenerator_6E extends AbstractShieldGenerator
{
    public ShieldGenerator_6E()
    {
        super("6E Shield Generator",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.86),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 80.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.3),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}