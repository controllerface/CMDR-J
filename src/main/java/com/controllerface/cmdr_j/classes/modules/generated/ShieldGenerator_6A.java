package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_6A extends AbstractModule
{
    public ShieldGenerator_6A()
    {
        super("6A Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 136.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 4.34),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 120.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.3),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}