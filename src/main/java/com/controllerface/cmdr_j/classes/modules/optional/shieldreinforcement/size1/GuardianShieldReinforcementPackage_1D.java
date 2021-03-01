package com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianShieldReinforcementPackage_1D extends AbstractGuardianModule
{
    public GuardianShieldReinforcementPackage_1D()
    {
        super("Shield Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 1.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.46),
                        new ItemEffectData(ItemEffect.Integrity, 36.0),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 61.0)
                ));
    }

    @Override
    public long price()
    {
        return 30_000;
    }
}