package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_8A extends AbstractPowerDistributor
{
    public PowerDistributor_8A()
    {
        super("8A Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 165.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.96),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 72.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 7.2),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 48.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 4.8),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 48.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 4.8)
                ));
    }

    @Override
    public long price()
    {
        return 27_249_390;
    }
}