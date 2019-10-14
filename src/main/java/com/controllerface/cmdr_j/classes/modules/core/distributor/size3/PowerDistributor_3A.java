package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_3A extends AbstractPowerDistributor
{
    public PowerDistributor_3A()
    {
        super("3A Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 70.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 24.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 2.8),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 18.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.3),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 18.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.3)
            ));
    }

    @Override
    public long price()
    {
        return 158_330;
    }
}