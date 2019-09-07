package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_4E extends AbstractPowerDistributor
{
    public PowerDistributor_4E()
    {
        super("4E Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 72.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 22.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 2.3),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 15.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.3),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 15.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.3)
            ));
    }
}