package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHRP_1D extends AbstractGuardianModule
{
    public GuardianHRP_1D()
    {
        super("1D Guardian Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.56d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.CausticResistance, 5d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 138d)
                ));
    }

    @Override
    public long price()
    {
        return 30_000;
    }
}
