package com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianShieldReinforcementPackage_2E extends AbstractGuardianModule
{
    public GuardianShieldReinforcementPackage_2E()
    {
        super("2E Guardian Shield Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.56),
                        new ItemEffectData(ItemEffect.Integrity, 36.0),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 83.0)
                ));
    }

    @Override
    public long price()
    {
        return 24_000;
    }
}