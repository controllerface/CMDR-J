package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_2A extends AbstractLifeSupport
{
    public LifeSupport_2A()
    {
        super("2A Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 61.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.55),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 56_550;
    }
}