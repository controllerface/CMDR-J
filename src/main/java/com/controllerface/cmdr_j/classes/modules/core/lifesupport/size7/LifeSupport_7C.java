package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;

public class LifeSupport_7C extends AbstractLifeSupport
{
    public LifeSupport_7C()
    {
        super("7C Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 131.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.9),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 600.0)
            ));
    }
}