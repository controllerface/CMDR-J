package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_6A extends AbstractPowerDistributor
{
    public PowerDistributor_6A()
    {
        super("6A Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 124.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.82),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 50.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 5.2),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 35.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 3.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 35.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 3.2)
                ));
    }

    @Override
    public long price()
    {
        return 3_475_690;
    }
}