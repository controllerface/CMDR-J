package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_8A extends AbstractLifeSupport
{
    public LifeSupport_8A()
    {
        super("8A Life Support",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 180.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
            ));
    }

    @Override
    public long price()
    {
        return 27_249_400;
    }
}