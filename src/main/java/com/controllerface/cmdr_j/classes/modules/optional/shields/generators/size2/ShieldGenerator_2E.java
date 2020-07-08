package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_2E extends AbstractShieldGenerator
{
    public ShieldGenerator_2E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 2.5d),
                new ItemEffectData(ItemEffect.Integrity, 41d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.9d),
                new ItemEffectData(ItemEffect.BootTime, 1d),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
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
        return 1_980;
    }
}
