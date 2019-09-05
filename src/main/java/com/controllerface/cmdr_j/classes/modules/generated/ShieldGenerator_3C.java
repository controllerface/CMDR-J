package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_3C extends AbstractModule
{
    public ShieldGenerator_3C()
    {
        super("3C Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.8),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 100.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.0),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}