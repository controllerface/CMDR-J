package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_7E extends AbstractShieldGenerator
{
    public ShieldGenerator_7E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 80.0),
                new ItemEffectData(ItemEffect.Integrity, 105.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.1),
                new ItemEffectData(ItemEffect.BootTime, 1.0),
                new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30.0),
                new ItemEffectData(ItemEffect.ShieldGenStrength, 80.0),
                new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130.0),
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
        return 633_200;
    }
}