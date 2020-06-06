package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_3A extends AbstractLifeSupport
{
    public LifeSupport_3A()
    {
        super("3A Life Support",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 77.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
            ));
    }

    @Override
    public long price()
    {
        return 158_330;
    }
}