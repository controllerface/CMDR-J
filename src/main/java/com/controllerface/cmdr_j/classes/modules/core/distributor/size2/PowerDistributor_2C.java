package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_2C extends AbstractPowerDistributor
{
    public PowerDistributor_2C()
    {
        super("2C Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 15.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 1.8),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 12.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.7),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 12.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.7)
                ));
    }

    @Override
    public long price()
    {
        return 9_050;
    }
}