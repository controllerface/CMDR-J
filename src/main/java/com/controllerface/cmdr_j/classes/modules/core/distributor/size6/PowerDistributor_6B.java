package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_6B extends AbstractPowerDistributor
{
    public PowerDistributor_6B()
    {
        super("6B Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 136.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.75),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 46.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 4.7),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 32.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 3.0),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 32.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 3.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_390_280;
    }
}