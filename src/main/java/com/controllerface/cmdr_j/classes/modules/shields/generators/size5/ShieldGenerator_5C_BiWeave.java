package com.controllerface.cmdr_j.classes.modules.shields.generators.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldGenerator_5C_BiWeave extends AbstractShieldGenerator
{
    public ShieldGenerator_5C_BiWeave()
    {
        super("5C Bi-Weave Shield Generator",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.6),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
                  new ItemEffectData(ItemEffect.RegenRate, 2.2),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 5.625),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}