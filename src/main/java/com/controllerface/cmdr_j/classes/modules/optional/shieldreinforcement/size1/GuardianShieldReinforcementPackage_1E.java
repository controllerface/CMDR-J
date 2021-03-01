package com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianShieldReinforcementPackage_1E extends AbstractGuardianModule
{
    public GuardianShieldReinforcementPackage_1E()
    {
        super("Shield Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.35),
                        new ItemEffectData(ItemEffect.Integrity, 36.0),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 44.0)
                ));
    }

    @Override
    public long price()
    {
        return 10_000;
    }
}