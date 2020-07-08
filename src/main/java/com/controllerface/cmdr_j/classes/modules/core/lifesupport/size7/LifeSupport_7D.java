package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_7D extends AbstractLifeSupport
{
    public LifeSupport_7D()
    {
        super("7D Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 118.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.81),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
                ));
    }

    @Override
    public long price()
    {
        return 622_840;
    }
}