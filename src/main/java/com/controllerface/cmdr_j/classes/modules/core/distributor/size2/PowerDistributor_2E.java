package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_2E extends AbstractPowerDistributor
{
    public PowerDistributor_2E()
    {
        super("2E Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 46.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.36),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 12.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 1.4),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 10.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.6),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 10.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.6)
                ));
    }

    @Override
    public long price()
    {
        return 1_450;
    }
}