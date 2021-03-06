package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_2B extends AbstractPowerDistributor
{
    public PowerDistributor_2B()
    {
        super("2B Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 61.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 17.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.0),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 13.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.8),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 13.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.8)
                ));
    }

    @Override
    public long price()
    {
        return 22_620;
    }
}