package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_3D extends AbstractLifeSupport
{
    public LifeSupport_3D()
    {
        super("3D Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 58.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
                ));
    }

    @Override
    public long price()
    {
        return 10_130;
    }
}