package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_3B extends AbstractLifeSupport
{
    public LifeSupport_3B()
    {
        super("3B Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 70.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.58),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 900.0)
                ));
    }

    @Override
    public long price()
    {
        return 63_330;
    }
}