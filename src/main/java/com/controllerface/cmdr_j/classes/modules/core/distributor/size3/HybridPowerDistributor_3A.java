package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_3A extends AbstractGuardianModule
{
    public HybridPowerDistributor_3A()
    {
        super("3A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 5.25),
                        new ItemEffectData(ItemEffect.Integrity, 56.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.78),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 17.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 3.90),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 14.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.7),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 14.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.7)
                ));
    }

    @Override
    public long price()
    {
        return 273_223;
    }
}
