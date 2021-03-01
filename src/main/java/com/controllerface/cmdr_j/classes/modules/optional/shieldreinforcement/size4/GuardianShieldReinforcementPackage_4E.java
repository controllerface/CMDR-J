package com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianShieldReinforcementPackage_4E extends AbstractGuardianModule
{
    public GuardianShieldReinforcementPackage_4E()
    {
        super("Shield Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.95),
                        new ItemEffectData(ItemEffect.Integrity, 36.0),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 165.0)
                ));
    }

    @Override
    public long price()
    {
        return 138_240;
    }
}