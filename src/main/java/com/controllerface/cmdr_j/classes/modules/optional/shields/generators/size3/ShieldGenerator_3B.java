package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_3B extends AbstractShieldGenerator
{
    public ShieldGenerator_3B()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 90.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.16),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 110.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160.0),
                new ItemEffectData(ItemEffect.RegenRate, 1.0),
                new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87),
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
        return 169_300;
    }
}