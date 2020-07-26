package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_2A extends AbstractShieldGenerator
{
    public ShieldGenerator_2A()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 2.5d),
                new ItemEffectData(ItemEffect.Integrity, 61d),
                new ItemEffectData(ItemEffect.PowerDraw, 2.1d),
                new ItemEffectData(ItemEffect.BootTime, 1d),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
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

    @Override
    public long price()
    {
        return 160_220;
    }
}
