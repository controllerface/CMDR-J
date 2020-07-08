package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_2A extends AbstractGuardianModule
{
    public HybridPowerDistributor_2A()
    {
        super("Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.6),
                        new ItemEffectData(ItemEffect.Integrity, 45.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.73),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 13.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 3.10),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 11.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 1.0),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 11.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 1.0)
                ));
    }

    @Override
    public long price()
    {
        return 97_929;
    }
}
