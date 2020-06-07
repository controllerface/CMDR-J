package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_2A_Prismatic extends AbstractShieldGenerator
{
    public ShieldGenerator_2A_Prismatic()
    {
        super("2A Prismatic Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 61d),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.15d),
                        new ItemEffectData(ItemEffect.BootTime, 1d),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                        new ItemEffectData(ItemEffect.RegenRate, 1d),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 1.2d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                        new ItemEffectData(ItemEffect.KineticResistance, 40d),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 240_340;
    }
}
