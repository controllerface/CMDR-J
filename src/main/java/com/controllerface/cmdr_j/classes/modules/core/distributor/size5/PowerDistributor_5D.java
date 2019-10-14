package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_5D extends AbstractPowerDistributor
{
    public PowerDistributor_5D()
    {
        super("5D Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 77.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.56),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 31.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 3.2),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 22.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.9),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 22.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.9)
            ));
    }

    @Override
    public long price()
    {
        return 79_440;
    }
}