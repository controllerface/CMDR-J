package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_7B extends AbstractPowerDistributor
{
    public PowerDistributor_7B()
    {
        super("7B Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 128.0),
                        new ItemEffectData(ItemEffect.Integrity, 157.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.81),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 56.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 5.6),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 37.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 3.6),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 37.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 3.6)
                ));
    }

    @Override
    public long price()
    {
        return 3_892_770;
    }
}