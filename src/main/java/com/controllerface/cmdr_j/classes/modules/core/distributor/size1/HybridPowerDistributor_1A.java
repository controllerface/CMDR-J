package com.controllerface.cmdr_j.classes.modules.core.distributor.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_1A extends AbstractGuardianModule
{
    public HybridPowerDistributor_1A()
    {
        super("Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 1.4),
                        new ItemEffectData(ItemEffect.Integrity, 35.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 10.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 2.5),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 9.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 0.8),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 10.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 0.80)
                ));
    }

    @Override
    public long price()
    {
        return 35_940;
    }
}
