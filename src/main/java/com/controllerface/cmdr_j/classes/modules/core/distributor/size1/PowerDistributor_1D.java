package com.controllerface.cmdr_j.classes.modules.core.distributor.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_1D extends AbstractPowerDistributor
{
    public PowerDistributor_1D()
    {
        super("1D Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 0.5),
                        new ItemEffectData(ItemEffect.Integrity, 32.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.36),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 11.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 1.4),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 9.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.5),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 9.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.5)
                ));
    }

    @Override
    public long price()
    {
        return 1_290;
    }
}