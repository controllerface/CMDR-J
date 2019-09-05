package com.controllerface.cmdr_j.classes.modules.modulereinforcment.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianMRP_5E extends AbstractGuardianModule
{
    public GuardianMRP_5E()
    {
        super("5E Guardian Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 424d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.81d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
