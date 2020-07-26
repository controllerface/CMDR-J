package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_2A extends AbstractPowerDistributor
{
    public PowerDistributor_2A()
    {
        super("2A Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 56.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.54),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 18.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.2),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 14.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.8),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 14.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.8)
                ));
    }

    @Override
    public long price()
    {
        return 56_550;
    }
}