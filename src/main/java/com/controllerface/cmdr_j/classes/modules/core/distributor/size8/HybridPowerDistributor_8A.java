package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_8A extends AbstractGuardianModule
{
    public HybridPowerDistributor_8A()
    {
        super("Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 168.00),
                        new ItemEffectData(ItemEffect.Integrity, 132.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.25),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 50.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 10.10),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 36.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 6.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 36.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 6.2)
                ));
    }

    @Override
    public long price()
    {
        return 46_188_786;
    }
}
