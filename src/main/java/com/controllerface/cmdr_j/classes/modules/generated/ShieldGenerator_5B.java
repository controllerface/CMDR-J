package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_5B extends AbstractModule
{
    public ShieldGenerator_5B()
    {
        super("5B Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 32.0),
                  new ItemEffectData(ItemEffect.Integrity, 134.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 3.12),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 110.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}