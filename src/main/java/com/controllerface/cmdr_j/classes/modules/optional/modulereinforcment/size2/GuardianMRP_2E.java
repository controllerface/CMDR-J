package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianMRP_2E extends AbstractGuardianModule
{
    public GuardianMRP_2E()
    {
        super("2E Guardian Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.Integrity, 127d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
