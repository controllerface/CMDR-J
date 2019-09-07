package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_1D extends AbstractLifeSupport
{
    public LifeSupport_1D()
    {
        super("1D Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 0.5),
                  new ItemEffectData(ItemEffect.Integrity, 36.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.36),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
            ));
    }
}