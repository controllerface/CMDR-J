package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_7C extends AbstractPowerDistributor
{
    public PowerDistributor_7C()
    {
        super("7C Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 131.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.74),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 51.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 5.1),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 34.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 3.3),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 34.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 3.3)
                ));
    }

    @Override
    public long price()
    {
        return 1_557_110;
    }
}