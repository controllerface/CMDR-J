package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_1C extends AbstractShieldGenerator
{
    public ShieldGenerator_1C()
    {
        // todo: update stats, these are from 1A
        super("1C Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.68d),
                        new ItemEffectData(ItemEffect.BootTime, 1d),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                        new ItemEffectData(ItemEffect.RegenRate, 1d),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                        new ItemEffectData(ItemEffect.KineticResistance, 40d),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
                ));
    }
}
