package com.controllerface.cmdr_j.classes.procurements.modules.guardian.core.distributor.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HybridPowerDistributor_5A extends AbstractGuardianModule
{
    public HybridPowerDistributor_5A()
    {
        super("5A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d)
                ));
    }
}
