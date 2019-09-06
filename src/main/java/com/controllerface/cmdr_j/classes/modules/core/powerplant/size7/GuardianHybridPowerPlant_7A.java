package com.controllerface.cmdr_j.classes.modules.core.powerplant.size7;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;

public class GuardianHybridPowerPlant_7A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_7A()
    {
        super("7A Guardian Hybrid Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 46.8),
                  new ItemEffectData(ItemEffect.Integrity, 144.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 39.6),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}