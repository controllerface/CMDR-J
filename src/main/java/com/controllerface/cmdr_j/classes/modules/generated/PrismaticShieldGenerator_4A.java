package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class PrismaticShieldGenerator_4A extends AbstractModule
{
    public PrismaticShieldGenerator_4A()
    {
        super("4A Prismatic Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 4.62),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 150.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 1.66),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}