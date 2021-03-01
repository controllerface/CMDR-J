package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_8C extends AbstractLifeSupport
{
    public LifeSupport_8C()
    {
        super("8C Life Support",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 150.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.0),
                        new ItemEffectData(ItemEffect.BootTime, 1.0),
                        new ItemEffectData(ItemEffect.OxygenTimeCapacity, 600.0)
                ));
    }

    @Override
    public long price()
    {
        return 4_359_900;
    }
}