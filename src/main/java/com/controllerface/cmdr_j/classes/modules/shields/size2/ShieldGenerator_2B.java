package com.controllerface.cmdr_j.classes.modules.shields.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.shields.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldGenerator_2B extends AbstractShieldGenerator
{
    public ShieldGenerator_2B()
    {
        super("2B Shield Generator",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.Integrity, 71d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                        new ItemEffectData(ItemEffect.BootTime, 1d),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                        new ItemEffectData(ItemEffect.RegenRate, 1d),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                        new ItemEffectData(ItemEffect.KineticResistance, 40d),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
                ));
    }
}
