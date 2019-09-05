package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class GuardianShieldReinforcementPackage_4E extends AbstractModule
{
    public GuardianShieldReinforcementPackage_4E()
    {
        super("4E Guardian Shield Reinforcement Package", null, null, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.95),
                  new ItemEffectData(ItemEffect.Integrity, 36.0),
                  new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 165.0)
            ));
    }
}