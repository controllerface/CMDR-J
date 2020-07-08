package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_6E extends AbstractLifeSupport
{
    public LifeSupport_6E()
    {
        super("6E Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 90.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 300.0)
                ));
    }

    @Override
    public long price()
    {
        return 88_980;
    }
}