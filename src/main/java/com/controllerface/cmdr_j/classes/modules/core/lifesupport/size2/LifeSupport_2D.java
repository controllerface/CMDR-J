package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_2D extends AbstractLifeSupport
{
    public LifeSupport_2D()
    {
        super("2D Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 1.0),
                        new ItemEffectData(ItemEffect.Integrity, 46.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_620;
    }
}