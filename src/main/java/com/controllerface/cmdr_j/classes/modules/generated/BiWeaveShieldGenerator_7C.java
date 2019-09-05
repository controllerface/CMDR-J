package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class BiWeaveShieldGenerator_7C extends AbstractModule
{
    public BiWeaveShieldGenerator_7C()
    {
        super("7C Bi-Weave Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 131.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 3.5),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530.0),
                  new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650.0),
                  new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40.0),
                  new ItemEffectData(ItemEffect.ShieldGenStrength, 90.0),
                  new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140.0),
                  new ItemEffectData(ItemEffect.RegenRate, 4.4),
                  new ItemEffectData(ItemEffect.BrokenRegenRate, 10.995),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.6),
                  new ItemEffectData(ItemEffect.ThermalLoad, 1.2),
                  new ItemEffectData(ItemEffect.KineticResistance, 40.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -20.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 50.0)
            ));
    }
}