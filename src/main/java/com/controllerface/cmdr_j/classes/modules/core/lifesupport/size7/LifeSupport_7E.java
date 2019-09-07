package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_7E extends AbstractLifeSupport
{
    public LifeSupport_7E()
    {
        super("7E Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 105.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.72),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 300.0)
            ));
    }
}