package com.controllerface.cmdr_j.classes.procurements.modules.guardian.core.distributor.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HybridPowerDistributor_7A extends AbstractGuardianModule
{
    public HybridPowerDistributor_7A()
    {
        super("7A Guardian Hybrid Power Distributor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d)
                ));
    }
}
