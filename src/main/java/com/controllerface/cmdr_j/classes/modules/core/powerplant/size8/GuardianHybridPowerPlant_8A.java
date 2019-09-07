package com.controllerface.cmdr_j.classes.modules.core.powerplant.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianHybridPowerPlant_8A extends AbstractGuardianModule
{
    public GuardianHybridPowerPlant_8A()
    {
        super("8A Guardian Hybrid Power Plant", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 93.6),
                  new ItemEffectData(ItemEffect.Integrity, 165.0),
                  new ItemEffectData(ItemEffect.PowerCapacity, 47.5),
                  new ItemEffectData(ItemEffect.HeatEfficiency, 0.5)
            ));
    }
}