package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHRP_2E extends AbstractGuardianModule
{
    public GuardianHRP_2E()
    {
        super("2E Guardian Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.68d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.CausticResistance, 5d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 188d)
                ));
    }
}
