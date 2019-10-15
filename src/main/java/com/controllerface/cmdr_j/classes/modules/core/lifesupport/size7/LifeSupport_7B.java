package com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class LifeSupport_7B extends AbstractLifeSupport
{
    public LifeSupport_7B()
    {
        super("7B Standard Life Support", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 128.0),
                  new ItemEffectData(ItemEffect.Integrity, 144.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.99),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.OxygenTimeCapacity, 900.0)
            ));
    }

    @Override
    public long price()
    {
        return 3_892_770;
    }
}