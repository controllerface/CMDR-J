package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_1C_BiWeave extends AbstractShieldGenerator
{
    public ShieldGenerator_1C_BiWeave()
    {
        super("1C Bi-Weave Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2d),
                        new ItemEffectData(ItemEffect.BootTime, 1d),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                        new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 2.4d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                        new ItemEffectData(ItemEffect.KineticResistance, 40d),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
                ));
    }
}
