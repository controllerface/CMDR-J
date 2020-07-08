package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_4D extends AbstractPowerDistributor
{
    public PowerDistributor_4D()
    {
        super("4D Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 24.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.6),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 17.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.4),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 17.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.4)
                ));
    }

    @Override
    public long price()
    {
        return 28_370;
    }
}