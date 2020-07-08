package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_5D extends AbstractShieldGenerator
{
    public ShieldGenerator_5D()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 5.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 58.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.08),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
                new ItemEffectData(ItemEffect.RegenRate, 1.0),
                new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75),
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
        return 189_040;
    }
}