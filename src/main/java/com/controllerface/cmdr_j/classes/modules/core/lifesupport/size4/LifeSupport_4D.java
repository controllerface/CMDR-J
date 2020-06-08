package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_4D extends AbstractLifeSupport
{
    public LifeSupport_4D()
    {
        super("4D Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 72.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.56),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
                ));
    }

    @Override
    public long price()
    {
        return 28_370;
    }
}