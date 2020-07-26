package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_4B extends AbstractPowerDistributor
{
    public PowerDistributor_4B()
    {
        super("4B Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 16.0),
                        new ItemEffectData(ItemEffect.Integrity, 96.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 30.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 3.2),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 21.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.8),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 21.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.8)
                ));
    }

    @Override
    public long price()
    {
        return 177_330;
    }
}