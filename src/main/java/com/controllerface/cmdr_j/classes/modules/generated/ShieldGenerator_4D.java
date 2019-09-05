package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_4D extends AbstractModule
{
    public ShieldGenerator_4D()
    {
        super("4D Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 48.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.76),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}