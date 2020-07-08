package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_6E extends AbstractPowerDistributor
{
    public PowerDistributor_6E()
    {
        super("6E Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 102.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.54),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 34.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 3.4),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 23.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 23.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.2)
                ));
    }

    @Override
    public long price()
    {
        return 88_980;
    }
}