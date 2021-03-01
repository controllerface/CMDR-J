package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_5E extends AbstractPowerDistributor
{
    public PowerDistributor_5E()
    {
        super("5E Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 86.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 27.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.9),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 19.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.7),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 19.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.7)
                ));
    }

    @Override
    public long price()
    {
        return 31_780;
    }
}