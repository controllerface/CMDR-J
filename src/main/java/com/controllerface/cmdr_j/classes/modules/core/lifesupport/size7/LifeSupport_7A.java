package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_7A extends AbstractLifeSupport
{
    public LifeSupport_7A()
    {
        super("7A Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 157.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.08),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
                ));
    }

    @Override
    public long price()
    {
        return 9_731_930;
    }
}