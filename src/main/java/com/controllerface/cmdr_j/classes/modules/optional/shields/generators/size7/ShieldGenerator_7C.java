package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_7C extends AbstractShieldGenerator
{
    public ShieldGenerator_7C()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 80.0),
                new ItemEffectData(ItemEffect.Integrity, 131.0),
                new ItemEffectData(ItemEffect.PowerDraw, 3.5),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 100.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150.0),
                new ItemEffectData(ItemEffect.RegenRate, 1.8),
                new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33),
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
        return 5_698_790;
    }
}