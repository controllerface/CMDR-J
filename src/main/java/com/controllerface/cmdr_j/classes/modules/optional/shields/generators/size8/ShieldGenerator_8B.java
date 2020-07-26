package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_8B extends AbstractShieldGenerator
{
    public ShieldGenerator_8B()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 8.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 256.0),
                new ItemEffectData(ItemEffect.Integrity, 210.0),
                new ItemEffectData(ItemEffect.PowerDraw, 4.8),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 110.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160.0),
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
        return 54_195_500;
    }
}