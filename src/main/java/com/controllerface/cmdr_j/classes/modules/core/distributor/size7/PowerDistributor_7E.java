package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_7E extends AbstractPowerDistributor
{
    public PowerDistributor_7E()
    {
        super("7E Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 118.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.59),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 41.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 4.1),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 27.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.6),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 27.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.6)
                ));
    }

    @Override
    public long price()
    {
        return 249_140;
    }
}