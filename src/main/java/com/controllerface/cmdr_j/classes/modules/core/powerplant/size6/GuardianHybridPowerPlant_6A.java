package com.controllerface.cmdr_j.classes.modules.core.powerplant.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianHybridPowerPlant_6A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_6A()
    {
        super("6A Guardian Hybrid Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 23.4),
                  new ItemEffectData(ItemEffect.Integrity, 124.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 33.3),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}