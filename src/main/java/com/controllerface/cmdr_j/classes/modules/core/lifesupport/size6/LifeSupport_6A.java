package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;

public class LifeSupport_6A extends AbstractLifeSupport
{
    public LifeSupport_6A()
    {
        super("6A Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 136.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.96),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 1500.0)
            ));
    }
}