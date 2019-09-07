package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_3C extends AbstractPowerDistributor
{
    public PowerDistributor_3C()
    {
        super("3C Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 20.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 2.3),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 15.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.1),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 15.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.1)
            ));
    }
}