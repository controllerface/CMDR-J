package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_5B extends AbstractPowerDistributor
{
    public PowerDistributor_5B()
    {
        super("5B Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 115.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.68),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 37.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 4.0),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 26.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.3),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 26.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.3)
                ));
    }

    @Override
    public long price()
    {
        return 496_530;
    }
}