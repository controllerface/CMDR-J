package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_4B extends AbstractLifeSupport
{
    public LifeSupport_4B()
    {
        super("4B Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 88.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.68),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 900.0)
                ));
    }

    @Override
    public long price()
    {
        return 177_330;
    }
}