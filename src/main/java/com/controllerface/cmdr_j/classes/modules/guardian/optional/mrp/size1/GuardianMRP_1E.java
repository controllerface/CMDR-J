package com.controllerface.cmdr_j.classes.modules.guardian.optional.mrp.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianMRP_1E extends AbstractGuardianModule
{
    public GuardianMRP_1E()
    {
        super("1E Guardian Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 85d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
