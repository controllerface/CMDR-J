package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_1B extends AbstractLifeSupport
{
    public LifeSupport_1B()
    {
        super("1B Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 44.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.44),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 900.0)
                ));
    }

    @Override
    public long price()
    {
        return 8_080;
    }
}