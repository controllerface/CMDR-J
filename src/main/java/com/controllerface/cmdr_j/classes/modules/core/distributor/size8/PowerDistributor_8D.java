package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerDistributor_8D extends AbstractPowerDistributor
{
    public PowerDistributor_8D()
    {
        super("8D Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 120.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.72),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 54.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 5.4),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 36.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 3.6),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 36.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 3.6)
            ));
    }
}