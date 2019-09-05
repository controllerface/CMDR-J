package com.controllerface.cmdr_j.classes.procurements.modules.guardian.optional.hrp.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianHRP_2D extends AbstractGuardianModule
{
    public GuardianHRP_2D()
    {
        super("2D Guardian Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.79d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.CausticResistance, 5d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 238d)
                ));
    }
}
