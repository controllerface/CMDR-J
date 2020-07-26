package com.controllerface.cmdr_j.classes.modules.core.distributor.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_7A extends AbstractGuardianModule
{
    public HybridPowerDistributor_7A()
    {
        super("Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 84.00),
                        new ItemEffectData(ItemEffect.Integrity, 115.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.16),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 43.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 8.5),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 31.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 5.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 31.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 5.2)
                ));
    }

    @Override
    public long price()
    {
        return 16_555_121;
    }
}
