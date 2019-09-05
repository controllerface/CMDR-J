package com.controllerface.cmdr_j.classes.modules.guardian.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HybridPowerDistributor_6A extends AbstractGuardianModule
{
    public HybridPowerDistributor_6A()
    {
        super("6A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d)
                ));
    }
}
