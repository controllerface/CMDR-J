package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_8E extends AbstractShieldGenerator
{
    public ShieldGenerator_8E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 8.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 160.0),
                new ItemEffectData(ItemEffect.Integrity, 120.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.4),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 80.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130.0),
                new ItemEffectData(ItemEffect.RegenRate, 2.4),
                new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6),
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
        return 2_007_240;
    }
}