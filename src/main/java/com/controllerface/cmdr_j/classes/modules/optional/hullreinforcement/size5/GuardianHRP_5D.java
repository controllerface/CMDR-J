package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHRP_5D extends AbstractGuardianModule
{
    public GuardianHRP_5D()
    {
        super("5D Guardian Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.46d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.CausticResistance, 5d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 488d)
                ));
    }

    @Override
    public long price()
    {
        return 995_328;
    }
}
