package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_5C extends AbstractPowerDistributor
{
    public PowerDistributor_5C()
    {
        super("5C Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 96.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 34.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 3.6),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 24.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.1),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 24.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.1)
                ));
    }

    @Override
    public long price()
    {
        return 198_610;
    }
}