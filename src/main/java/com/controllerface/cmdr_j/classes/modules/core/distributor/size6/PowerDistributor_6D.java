package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_6D extends AbstractPowerDistributor
{
    public PowerDistributor_6D()
    {
        super("6D Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.61),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 38.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 3.9),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 26.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 2.4),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 26.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 2.4)
            ));
    }

    @Override
    public long price()
    {
        return 222_440;
    }
}