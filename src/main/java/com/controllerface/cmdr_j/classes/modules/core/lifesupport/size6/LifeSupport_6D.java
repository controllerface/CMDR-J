package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_6D extends AbstractLifeSupport
{
    public LifeSupport_6D()
    {
        super("6D Life Support",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 102.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.72),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
            ));
    }

    @Override
    public long price()
    {
        return 222_440;
    }
}