package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_3A_Prismatic extends AbstractShieldGenerator
{
    public ShieldGenerator_3A_Prismatic()
    {
        super("3A Prismatic Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 10.0),
                        new ItemEffectData(ItemEffect.Integrity, 77.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.78),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83.0),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100.0),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 150.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200.0),
                        new ItemEffectData(ItemEffect.RegenRate, 1.0),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 1.3),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                        new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }

    @Override
    public long price()
    {
        return 761_870;
    }
}