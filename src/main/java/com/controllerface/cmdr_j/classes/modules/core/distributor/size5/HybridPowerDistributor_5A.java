package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_5A extends AbstractGuardianModule
{
    public HybridPowerDistributor_5A()
    {
        super("Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 21.00),
                        new ItemEffectData(ItemEffect.Integrity, 99.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.96),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 29.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 6.0),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 22.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 3.3),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 22.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 3.3)
                ));
    }

    @Override
    public long price()
    {
        return 2_126_788;
    }
}
