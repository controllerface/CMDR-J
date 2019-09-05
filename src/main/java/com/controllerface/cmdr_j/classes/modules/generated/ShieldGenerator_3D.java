package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_3D extends AbstractModule
{
    public ShieldGenerator_3D()
    {
        super("3D Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 38.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.44),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
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