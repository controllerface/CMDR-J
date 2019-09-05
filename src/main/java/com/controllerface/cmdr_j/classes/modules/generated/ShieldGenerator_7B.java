package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldGenerator_7B extends AbstractModule
{
    public ShieldGenerator_7B()
    {
        super("7B Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 128.0),
                  new ItemEffectData(ItemEffect.Integrity, 183.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 4.2),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 110.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160.0),
                  new ItemEffectData(ItemEffect.RegenRate, 1.8),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}