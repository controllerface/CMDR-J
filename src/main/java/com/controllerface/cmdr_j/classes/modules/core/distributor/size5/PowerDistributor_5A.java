package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_5A extends AbstractPowerDistributor
{
    public PowerDistributor_5A()
    {
        super("5A Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 106.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.74),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 41.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 4.3),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 29.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.5),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 29.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.5)
                ));
    }

    @Override
    public long price()
    {
        return 1_241_320;
    }
}