package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianMRP_4D extends AbstractGuardianModule
{
    public GuardianMRP_4D()
    {
        super("4D Guardian Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 259d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.74d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }

    @Override
    public long price()
    {
        return 414_720;
    }
}
