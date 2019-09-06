package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;

public class GuardianHybridPowerPlant_3A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_3A()
    {
        super("3A Guardian Hybrid Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 2.9),
                  new ItemEffectData(ItemEffect.Integrity, 70.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 15.8),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}