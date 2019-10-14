package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_8A extends AbstractShieldGenerator
{
    public ShieldGenerator_8A()
    {
        super("8A Shield Generator",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 180.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 5.6),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 120.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170.0),
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
        return 162_586_490;
    }
}