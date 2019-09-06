package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;

public class LifeSupport_5D extends AbstractLifeSupport
{
    public LifeSupport_5D()
    {
        super("5D Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 86.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 450.0)
            ));
    }
}