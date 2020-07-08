package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_7A extends AbstractPowerDistributor
{
    public PowerDistributor_7A()
    {
        super("7A Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 144.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.89),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 61.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 6.1),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 41.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 4.0),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 41.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 4.0)
                ));
    }

    @Override
    public long price()
    {
        return 9_731_930;
    }
}