package com.controllerface.cmdr_j.classes.modules.core.distributor.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_1B extends AbstractPowerDistributor
{
    public PowerDistributor_1B()
    {
        super("1B Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 48.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.44),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 13.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 1.7),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 11.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 0.6),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 11.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 0.6)
            ));
    }

    @Override
    public long price()
    {
        return 8_080;
    }
}