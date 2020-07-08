package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_7A_Prismatic extends AbstractShieldGenerator
{
    public ShieldGenerator_7A_Prismatic()
    {
        super("Prismatic Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.power_play, 0d),
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 157.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 7.35),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100.0),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 150.0),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200.0),
                        new ItemEffectData(ItemEffect.RegenRate, 1.1),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 4.25),
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
        return 76_933_670;
    }
}