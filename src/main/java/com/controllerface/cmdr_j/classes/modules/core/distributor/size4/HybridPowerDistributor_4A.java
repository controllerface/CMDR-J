package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_4A extends AbstractGuardianModule
{
    public HybridPowerDistributor_4A()
    {
        super("4A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 10.50),
                        new ItemEffectData(ItemEffect.Integrity, 70.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.87),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 22.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 4.90),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 17.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 2.5),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 17.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 2.5)
                ));
    }

    @Override
    public long price()
    {
        return 762_291;
    }
}
