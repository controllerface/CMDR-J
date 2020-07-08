package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_7D extends AbstractPowerDistributor
{
    public PowerDistributor_7D()
    {
        super("7D Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 105.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.67),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 46.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 4.6),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 31.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 3.0),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 31.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 3.0)
                ));
    }

    @Override
    public long price()
    {
        return 622_840;
    }
}