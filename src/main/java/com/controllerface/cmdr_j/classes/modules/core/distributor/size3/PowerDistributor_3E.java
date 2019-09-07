package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_3E extends AbstractPowerDistributor
{
    public PowerDistributor_3E()
    {
        super("3E Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 58.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 16.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 1.8),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 12.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 0.9),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 12.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 0.9)
            ));
    }
}