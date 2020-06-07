package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianMRP_3E extends AbstractGuardianModule
{
    public GuardianMRP_3E()
    {
        super("3E Guardian Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 187d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.54d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }

    @Override
    public long price()
    {
        return 57_600;
    }
}
