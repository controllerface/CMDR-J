package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_6A extends AbstractGuardianModule
{
    public HybridPowerDistributor_6A()
    {
        super("6A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 42.00),
                        new ItemEffectData(ItemEffect.Integrity, 99.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.07),
                        //new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.WeaponsCapacity, 35.0),
                        new ItemEffectData(ItemEffect.WeaponsRecharge, 7.3),
                        new ItemEffectData(ItemEffect.EnginesCapacity, 26.0),
                        new ItemEffectData(ItemEffect.EnginesRecharge, 4.2),
                        new ItemEffectData(ItemEffect.SystemsCapacity, 26.0),
                        new ItemEffectData(ItemEffect.SystemsRecharge, 4.2)
                ));
    }

    @Override
    public long price()
    {
        return 5_933_735;
    }
}
