package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HybridPowerDistributor_8A extends AbstractGuardianModule
{
    public HybridPowerDistributor_8A()
    {
        super("8A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d)
                ));
    }
}
