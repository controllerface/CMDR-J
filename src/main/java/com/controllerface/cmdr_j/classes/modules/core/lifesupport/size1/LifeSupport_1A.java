package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_1A extends AbstractLifeSupport
{
    public LifeSupport_1A()
    {
        super("1A Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 48.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 20_200;
    }
}